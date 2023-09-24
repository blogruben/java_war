<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Empleado</title>
</head>

<body>
    <h1>Zona segura - Empleados</h1>
    <p>
        <%
            out.println("<br> Bienvenido: "+request.getRemoteUser());
            out.println("<br> Autentification: "+request.getAuthType());
            out.println("<br> El role de usuario es 'admin': " + (request.isUserInRole("admin")?"SI":"NO"));
            out.println("<br> El protocolo es: " + request.getScheme());
            out.println("<br> El protocolo es seguro: " + (request.isSecure()?"SI":"NO"));
        %>
    </p>
    <p><a href="../gerentes/saludo.jsp">Ir a zona gerentes</a></p>
    <p><a href="../empleados/saludo.jsp">Ir a zona empleados</a></p>
    <p><a href="../publico/saludo.jsp">Ir a zona publica</a></p>
    <p><a href="../../login/logout.jsp">Ir a logout</a></p>
</body>

</html>