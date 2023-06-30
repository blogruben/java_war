<%@page import="com.ruben.java.web.UserDao"%>  
<jsp:useBean id="u" class="com.ruben.java.web.bean.Usuario"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=UserDao.update(u);  
response.sendRedirect("viewusers.jsp");  
%> 