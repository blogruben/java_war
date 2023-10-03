<html>  
<body>  
<%   
String name=request.getParameter("name");  
out.print("Hola "+name);  
session.setAttribute("user",name);  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
%> 
<a href="mostrarSession.jsp">Ver las sessiones</a>   
</body>  
</html>  