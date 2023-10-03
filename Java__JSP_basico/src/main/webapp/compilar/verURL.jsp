 <!-- http://localhost:8080/compilar/hola.jsp -->
<html>  
<body>  
<p>Hola</p>
<p><% out.print(2*5); %></p>  
${pageContext.request.contextPath}
<p>getServerName    <% out.print(request.getServerName()); %></p>
<p>getServerPort    <% out.print(request.getServerPort()); %></p>
<p>getServletPath   <% out.print(request.getServletPath()); %></p>
<p>getContextPath   <% out.print(request.getContextPath()); %></p>
<p>getRequestURI    <% out.print(request.getRequestURI()); %></p>
<p>getRequestURL    <% out.print(request.getRequestURL()); %></p>
      

</body>  
</html>  