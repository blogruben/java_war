# tomcat-seguridad-realm

# Requisitos 
1. Docker 
2. Java8

# Arrancar servidor 
```
gradle release       
docker-compose up -d
http://localhost:8081/demo/hola
```

Tambien podemos levantarlo as:
```
gradle release       

docker build -t tomcat-simple .

docker run -d -p 8080:8080 -v "$(pwd)/docker/sample.war:/usr/local/tomcat/webapps/sample.war" -v "$(pwd)/docker/server.xml:/usr/local/tomcat/conf/server.xml" tomcat-simple

http://localhost:8082/demo
```



