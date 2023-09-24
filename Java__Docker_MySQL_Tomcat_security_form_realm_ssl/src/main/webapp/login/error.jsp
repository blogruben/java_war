<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Error</title>
</head>

<body>
    <h1>Credenciales incorrectas !!</h1>
</body>

<p><a href="<%= response.encodeURL(request.getHeader("referer"))%>">Volver a intentar.</a></p>
<p><a href="../../index.jsp">Ir a Login</a></p>

</html>