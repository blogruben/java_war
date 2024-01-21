# tomcat-seguridad-realm

# Requisitos 
1. Docker 
2. Java8

# Arrancar servidor 
```
gradle release       
docker-compose up -d
http://localhost:8081/demo/hola
http://localhost:8081/demo/bbdd
```


# Publicar cambio
```powershell
gradle release; docker-compose restart  
```


