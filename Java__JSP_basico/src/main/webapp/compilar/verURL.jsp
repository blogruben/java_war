 <!-- http://localhost:8080/compilar/hola.jsp -->
<html>  
<body>  
<p>Hola</p>
<p><% out.print(2*5); %></p>  
#{2*3}
<p>${pageContext.request.serverName}</p>
<p><% out.print(request.getServletPath()); %></p>
<p><% out.print(request.getServerName()); %></p>
<p><% out.print(request.getServerPort()); %></p>
<p><% out.print(request.getServletPath()); %></p>
<p><% out.print(request.getContextPath()); %></p>
<p><% out.print(request.getRequestURL()); %></p>
      
</body>  
</html>  