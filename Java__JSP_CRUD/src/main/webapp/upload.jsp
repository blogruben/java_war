<!DOCTYPE html>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>View Users</title>
</head>

<body>

    <%@page import="com.ruben.java.web.UserDao,com.ruben.java.web.bean.*,java.util.List" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

            <h1>Users List</h1>

            <% List<Usuario> list=UserDao.getAllRecords();
                request.setAttribute("list",list);
            %>



</body>

</html>