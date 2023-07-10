
<%@ page import = "java.io.*,java.util.Locale" %>
<%@ page import = "javax.servlet.*,javax.servlet.http.* "%>

<%
   String title = "Caracteres Especiales";
   response.setContentType("text/html");
   //poner el idioma en la cabecera
   response.setHeader("Content-Language", "es");
%>

<html lang="es">
   <head>
      <title><% out.print(title); %></title>
   </head>
   
   <body>
      <center>
         <h1><% out.print(title); %></h1>
      </center>
      
      <div align = "center">
         <p>En Español</p>
         <p>¡Hola Mundo!</p>
      </div>
   </body>
</html>