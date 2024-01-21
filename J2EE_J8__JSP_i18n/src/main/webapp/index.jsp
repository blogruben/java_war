
<%@ page import = "java.io.*,java.util.Locale" %>
<%@ page import = "javax.servlet.*,javax.servlet.http.* "%>


<%
   String title = "i18n L10n";
   Locale locale = request.getLocale();
   String language = locale.getLanguage();
   String country = locale.getCountry();
%>

<html>
   <head>
      <title><% out.print(title); %></title>
   </head>

   <body>
      <center>
         <h1><% out.print(title); %></h1>
      </center>

      <p align = "center">         
         <p><a href="detectarIdioma.jsp"> Detectar Idioma </a></p>
         <p><a href="caracteresEspeciales.jsp"> Caracteres Especiales </a></p>
         <p><a href="fechas.jsp"> Fechas </a></p>
         <p><a href="monedas.jsp"> Monedas </a></p>
         
      </p>
   </body>
</html>