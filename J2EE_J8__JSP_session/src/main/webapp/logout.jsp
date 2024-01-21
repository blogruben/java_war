<%
    //cerramos la session
   if (session!=null){
        session.invalidate();
   }
%>
 
 <!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Session</title>
</head>

<body>
    <h1>Cerrar session!!</h1>
    <body>

        <a href="index.jsp">Ir a Index</a>
    </body>