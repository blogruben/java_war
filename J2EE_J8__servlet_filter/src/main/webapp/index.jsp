
<%@ page import = "java.io.*,java.util.Locale" %>
<%@ page import = "javax.servlet.*,javax.servlet.http.* "%>


<%
   String title = "Hola!";
%>

<html>
   <head>
      <title><% out.print(title); %></title>
   </head>

   <body>
      <center>
         <h1><% out.print(title); %></h1>
      </center>
      <%
      this.log("Hola!");
      %>
      </p>
   </body>
</html>