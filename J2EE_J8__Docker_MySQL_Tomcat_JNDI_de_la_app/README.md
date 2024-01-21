# tomcat-seguridad-realm

# Requisitos 
1. Docker 
2. Java8

# Arrancar servidor 
```
gradle release; docker-compose up -d;
http://localhost:8081/app/vars
http://localhost:8081/app/bbdd

http://localhost:8081/app/variables.jsp
http://localhost:8081/app/conexion.jsp
```

# Publicar cambios
```
gradle release; docker-compose restart;
```

# Eliminar todo
```
docker-compose down --volumes;docker image rm my-app my-db;
```
