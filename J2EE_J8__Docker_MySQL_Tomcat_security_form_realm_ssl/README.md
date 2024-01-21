# tomcat-seguridad-realm

# Requisitos 
1. Docker 
2. Java8

# Documentacion
https://tomcat.apache.org/tomcat-8.0-doc/realm-howto.html

# Generar almacen de certificados
Generar archivo docker/selfsigned.jks
```
cd docker
keytool -genkey -keyalg RSA -keystore selfsigned.jks -validity 365 -keysize 2048 -storepass 'changeit' -dname "CN=Raul, OU=Java, O=Oracle,L=Madrdi,S=Madrid, C=ES" -alias tomcat
```
# Arrancar servidor 
```
gradle release; docker-compose up -d;
https://localhost:8443/app/
https://localhost:8443/app/vars
https://localhost:8443/app/bbdd
https://localhost:8443/app/conexion.jsp
https://localhost:8443/app/fruta.jsp
```

# Publicar cambios
```
gradle release; docker-compose restart;
```

# Eliminar todo
```
docker-compose down --volumes;docker image rm my-app my-db;
```
