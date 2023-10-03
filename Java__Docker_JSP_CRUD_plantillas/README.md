# tomcat-seguridad-realm

# Requisitos 
1. Docker 
2. Java8

# Documentacion
https://jojozhuang.github.io/programming/building-website-with-jsp-and-mysql/

# Arrancar servidor 
```
gradle release; docker-compose up -d;
http://localhost:8081${pageContext.request.contextPath}/
```

# Publicar cambios
```
gradle release; docker-compose restart;
```

# Eliminar todo
```
docker-compose down --volumes;docker image rm my-app my-db;
```
