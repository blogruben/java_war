<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Edit Form</title>
</head>

<body>
    <%@page import="com.ruben.java.web.UserDao,com.ruben.java.web.bean.Usuario" %>

        <% String id=request.getParameter("id"); Usuario u=UserDao.getRecordById(Integer.parseInt(id)); %>

            <h1>Edit Form</h1>
            <form action="edituser.jsp" method="post">
                <input type="hidden" name="id" value="<%=u.getId() %>" />
                <table>
                    <tr>
                        <td>Name:</td>
                        <td>
                            <input type="text" name="nombre" value="<%= u.getNombre()%>" />
                        </td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td>
                            <input type="password" name="contrasena" value="<%= u.getContrasena()%>" />
                        </td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td>
                            <input type="email" name="email" value="<%= u.getEmail()%>" />
                        </td>
                    </tr>
                    <tr>
                        <td>Sex:</td>
                        <td>
                            <input type="radio" name="genero" value="M" checked/>Male
                            <input type="radio" name="genero" value="F" />Female
                        </td>
                    </tr>
                    <tr>
                        <td>Country:</td>
                        <td>
                            <select name="pais">
                                <option>Espana</option>
                                <option>India</option>
                                <option>Pakistan</option>
                                <option>Afghanistan</option>
                                <option>Other</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Edit User" /></td>
                    </tr>
                </table>
            </form>

</body>

</html>