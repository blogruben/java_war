# tomcat-seguridad-realm

# Requisitos 
1. Docker 
2. Java8


Documentacion 
https://tomcat.apache.org/tomcat-9.0-doc/ssl-howto.html


# Arrancar servidor 
```
gradle release; docker-compose up -d;
https://localhost:8443/app/hola.jsp
```

# Publicar cambios
```
gradle release; docker-compose restart
```

# Eliminar todo
```
docker-compose down --volumes;docker image rm my-app;
```

