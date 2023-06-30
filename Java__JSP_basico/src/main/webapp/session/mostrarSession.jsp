<html>  
<body>  
<%  
String nameSession=(String)session.getAttribute("user");  
out.print("<p>Session user:"+nameSession+"</p>");  

String namePageContext=(String)pageContext.getAttribute("user",PageContext.SESSION_SCOPE);  
out.print("<p>Page Context user:"+namePageContext+"</p>");  
%>  
</body>  
</html>  