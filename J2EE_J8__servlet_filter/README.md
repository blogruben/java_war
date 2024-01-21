
# Arrancar servidor 
``gradle wrapVersion``
``gradle appStart``
ctrl+C para cerrar jetty

http://localhost:8080/

Los filtros interceptasn las peticiones, 
y se usa como decorador, como logger o razones de seguridad.

Cuando ejecutamos http://localhost:8080/
vemos los siguientes logs:
```
Inicio Filtro!
00:31:46 INFO  jsp: Hola!
Final Filtro!
```