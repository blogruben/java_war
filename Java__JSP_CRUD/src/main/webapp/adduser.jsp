<%@page import="com.ruben.java.web.UserDao"%>  

<jsp:useBean id="u" class="com.ruben.java.web.bean.Usuario"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=UserDao.save(u);  
if(i>0){  
response.sendRedirect("adduser-success.jsp");  
}else{  
response.sendRedirect("adduser-error.jsp");  
}  
%>  