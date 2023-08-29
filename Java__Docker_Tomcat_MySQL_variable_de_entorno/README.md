# tomcat-seguridad-realm

# Requisitos 
1. Docker 
2. Java8

# Arrancar servidor 
```
gradle release; docker-compose up -d
http://localhost:8081/demo/
http://localhost:8081/demo/variables

```

Tambien podemos levantarlo asi:
```
gradle release       

docker run -d -p 8082:8080 -v "$(pwd)/docker/sample.war:/usr/local/tomcat/webapps/sample.war" -v "$(pwd)/docker/server.xml:/usr/local/tomcat/conf/server.xml" tomcat:8.0-alpine

```


# Publicar cambios
```
gradle release; docker-compose restart
```

# Eliminar todo
```
docker-compose down --volume
```
