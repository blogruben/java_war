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

    <% 
        String spageid=request.getParameter("page");  
        int pageid=Integer.parseInt(spageid);  
        int total=3; 
        if(pageid==1){}  
        else{  
            pageid=pageid-1;  
            pageid=pageid*total+1;  
        }  
        List<Usuario> list=UserDao.getRecordsPage(pageid,total);  
        request.setAttribute("list",list); 
    %>
    <table border="1" width="90%">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Password</th>
            <th>Email</th>
            <th>Sex</th>
            <th>Country</th>
        </tr>
        <c:forEach items="${list}" var="u">
            <tr>
                <td>${u.getId()}</td>
                <td>${u.getNombre()}</td>
                <td>${u.getContrasena()}</td>
                <td>${u.getEmail()}</td>
                <td>${u.getGenero()}</td>
                <td>${u.getPais()}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="paginado.jsp?page=1">1</a>  
    <a href="paginado.jsp?page=2">2</a>  
    <a href="paginado.jsp?page=3">3</a>  
</body>

</html>