<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<sql:query var="rs" dataSource="jdbc/MyDB">
select FrutaID, Nombre, Precio from Fruta;
</sql:query>

<html>
  <head>
    <title>Fruta</title>
  </head>
  <body>

  <h2>Listado de Fruta</h2>
<c:forEach var="row" items="${rs.rows}">
    FrutaID-${row.FrutaID}  Nombre-${row.Nombre}  Precio-${row.Precio}<br/>
</c:forEach>

  </body>
</html>