# tomcat-seguridad-realm

# Requisitos 
1. Docker 
2. Java8


Documentacion 
http://www.jtech.ua.es/j2ee/2002-2003/modulos/servlets/apuntes/apuntes3_2.htm


# Arrancar servidor 
```
gradle release; docker-compose up -d;
http://localhost:8081/app/

```

# Publicar cambios
```
gradle release; docker-compose restart
```

# Eliminar todo
```
docker-compose down --volumes;docker image rm my-app;
```
