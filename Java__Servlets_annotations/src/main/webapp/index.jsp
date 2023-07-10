<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario</title>
</head>
<body>
    <h1>Formulario para calcular area</h1>
    <form name="bmiForm" action="calculateServlet" method="POST">
        <table>
            <tr>
                <td>Ancho :</td>
                <td><input type="text" name="ancho"/></td>
            </tr>
            <tr>
                <td>Alto :</td>
                <td><input type="text" name="alto"/></td>
            </tr>
            <tr>
                <td>Mostrar:</td>
                <td><input type = "checkbox" name = "sin_decimales"  />sin decimales</td>
                <td><input type = "checkbox" name = "con_decimales"  />con decimales</td>
            </tr>
            <th><input type="submit" value="Enviar" name="find"/></th>
            <th><input type="reset" value="Limpiar" name="reset" /></th>
        </table>
        <h2>${area}</h2>
    </form>
</body>
</html>