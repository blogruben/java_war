
<%@ page import = "java.io.*,java.util.Locale" %>
<%@ page import = "javax.servlet.*,javax.servlet.http.* "%>


<%
   String title = "Detectar idioma";
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
         <% 
            out.println("<h4>Idioma : " + language  + "</h4>");
            out.println("<h4>Pais  : " + country   + "</h4>");
         %>
      </p>
   </body>
</html>