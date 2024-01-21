<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Zona Segura</title>
</head>

<body>
    <h1>Zona Segura</h1>
    <p>
        <%
            out.println("Bienvenido: "+request.getRemoteUser());
            out.println("<br> Autentification: "+request.getAuthType());
        %>
    </p>
</body>

</html>