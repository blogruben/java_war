# tomcat-seguridad-realm

# Requisitos 
1. Docker 
2. Java8

# OPCION 1 - contexto por defecto
Por defecto el contexto es el nombre de war
Por ejemplo para`/usr/local/tomcat/webapps/app.war`
la URL seria  http://localhost:8080/app/endpoint

# OPCION 2 - definir el conf/server.xml para todas las apps
Podemos definir el contexto en el fichero conf/server.xml de Tomcat
En la etiqueta host ponemos el contexto
```
    <Host name="localhost" appBase="webapps" copyXML="true"   deployXML="true" unpackWARs="true" autoDeploy="true"  deployOnStartup="true">

        <Context path="/demo" docBase="app.war"/>

        <Valve className="org.apache.catalina.valves.AccessLogValve" directory="logs"
               prefix="localhost_access_log" suffix=".txt"
               pattern="%h %l %u %t &quot;%r&quot; %s %b" />

    </Host>
```
Pero esta opcion es desaconsejable porque obliga 
a reiniciar el servidor cada vez que se modifica.

# OPCION 3 - definir dentro de la app el META-INF/context.xml  para esa app solamente
Podemos definir META-INF/context.xml 
```
<?xml version="1.0" encoding="UTF-8"?>
    <Context>
         <Resource name="jdbc/MyDB" 
          global="jdbc/MyDB" 
          auth="Container" 
          type="javax.sql.DataSource" 
          driverClassName="com.mysql.jdbc.Driver" 
          url="jdbc:mysql://mydb:3306/my_db_name" 
          username="root" 
          password="my-secret-pw" 
          
          maxActive="100" 
          maxIdle="20" 
          minIdle="5" 
          maxWait="10000"/>
    </Context>
```
Con la restricion de que no podemos definir el contexto de la url pero si jndi variables ...

# OPCION 4 - definir el contexto en /conf/Catalina/hostname para cada app

Para solucionarlo en el directorio `/conf/Catalina/hostname`
anadimos un fichero en el que el nombre del fichero es el nombre del contexto
Por ejemplo creamos el  `nombreContexto.xml` con el contexto donde 
ponemos la ruta absoluta del war
```
<?xml version="1.0"?>
    <Context docBase="/usr/local/tomcat/myapps/app.war">
</Context>
```
Y la url seria http://localhost:8080/nombreContexto/endpoint



# Arrancar servidor 
```
gradle release; docker-compose up -d;
http://localhost:8081/demo/

```

# Publicar cambios
```
gradle release; docker-compose restart
```

# Eliminar todo
```
docker-compose down --volumes;docker image rm my-app;  
```
