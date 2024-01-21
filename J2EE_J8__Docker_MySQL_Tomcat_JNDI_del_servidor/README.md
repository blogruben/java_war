# tomcat-seguridad-realm

# Requisitos 
1. Docker 
2. Java8

# Arrancar servidor 
```
gradle release; docker-compose up -d;
http://localhost:8081/demo/vars
http://localhost:8081/demo/bbdd

```

# Publicar cambios
```
gradle release; docker-compose restart
```

# Eliminar todo
```
docker-compose down --volumes;docker image rm my-app my-db;
```
