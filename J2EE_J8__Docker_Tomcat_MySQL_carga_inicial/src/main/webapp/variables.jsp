<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Saludar</title>
</head>
<body>
    <%@ page import="java.util.Iterator" %>
    <%@ page import="java.util.Map" %> 
    <%@ page import="java.util.Set" %> 
 
    <h1>Estas son todas las variables de entorno</h1>

    <%
    Map map = System.getenv();
    Set keys = map.keySet();
    Iterator iterator = keys.iterator();
    out.println("<p> Nombre de la variable  ->   Valor de la Variable</p>");
    while (iterator.hasNext()){
        String key = (String) iterator.next();
        String value = (String) map.get(key);
        out.println("<p> "+key + " -> " + value+"</p>");
    }
    
    %>
</body>
</html>