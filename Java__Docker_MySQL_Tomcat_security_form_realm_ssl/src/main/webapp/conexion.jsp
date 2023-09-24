<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Saludar</title>
</head>
<body>
    <%@ page import="java.sql.Connection,java.sql.PreparedStatement,javax.sql.DataSource" %>
    <%@ page import="java.sql.ResultSet,java.sql.SQLException,javax.naming.InitialContext" %> 

    <h1>Estas son todas las variables de entorno</h1>

    <%
    out.println("<p>INICIO MYSQL</p>");

    Connection conn = null;
    PreparedStatement ps = null;
    try {

        String mysqldatabase = System.getProperty("MYSQL_DATABASE");
        String mysqluser = System.getProperty("MYSQL_USER");
        String mysqlpass = System.getProperty("MYSQL_PASSWORD");

        out.println("<p> MYSQL_DATABASE ->"+mysqldatabase+"</p>");
        out.println("<p> MYSQL_USER ->"+mysqluser+"</p>");
        out.println("<p> MYSQL_PASSWORD ->"+mysqlpass+"</p>");

        InitialContext ic = new InitialContext();
        DataSource dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/MyDB");
        conn = dataSource.getConnection();
        out.println("<p> Connection ->"+conn+"</p>");

        ResultSet rs = null;            
        String query = "SELECT * FROM Persona ";
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
        while (rs.next()) {
            out.println("<p>[ PersonID-");
            out.println(rs.getInt("PersonID"));
            out.println(" LastName-");
            out.println(rs.getString("LastName"));
            out.println(" FirstName-");
            out.println(rs.getString("FirstName")+" ]</p>");
        }

    } catch (Exception  e) {
        out.println("Error ->"+e.fillInStackTrace());
        e.printStackTrace();
    } finally {
        try {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            out.println("Error ->"+e.fillInStackTrace());
        }
    }  
    out.println("<p>FIN MYSQL</p>");
    %>
</body>
</html>