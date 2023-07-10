
<%@ page import = "java.io.*,java.util.Locale" %>
<%@ page import = "javax.servlet.*,javax.servlet.http.* "%>
<%@ page import = "java.text.DateFormat,java.util.Date" %>

<%
   String title = "Fechas Locales";
   
   //Get the client's Locale
   Locale locale = request.getLocale( );
   
   String date = DateFormat.getDateTimeInstance(
      DateFormat.FULL, 
      DateFormat.SHORT, 
      locale).format(new Date( ));
%>

<html>
   
   <head>
      <title><% out.print(title); %></title>
   </head>
   
   <body>
      <center>
         <h1><% out.print(title); %></h1>
      </center>
      
      <div align = "center">
         <p>Local Date: <%  out.print(date); %></p>
      </div>
   </body>
</html>