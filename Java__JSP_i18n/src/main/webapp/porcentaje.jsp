
<%@ page import = "java.io.*,java.util.Locale" %>
<%@ page import = "javax.servlet.*,javax.servlet.http.* "%>
<%@ page import = "java.text.NumberFormat,java.util.Date" %>

<%
   String title = "Porcentaje";
   Locale locale = request.getLocale( );
   NumberFormat nft = NumberFormat.getPercentInstance(locale);
   String formattedPerc = nft.format(0.51);
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
         <p>Porcentaje: <%  out.print(formattedPerc); %></p>
      </div>
   </body>
</html>