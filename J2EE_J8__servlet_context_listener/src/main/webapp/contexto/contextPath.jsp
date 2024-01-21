<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Context Path Example</title>
</head>
<body>
Context Path Using implicit request object = "<%=request.getContextPath() %>"
<br>
Context Path Using JSP EL = "${pageContext.request.contextPath}"
</body>
</html>

