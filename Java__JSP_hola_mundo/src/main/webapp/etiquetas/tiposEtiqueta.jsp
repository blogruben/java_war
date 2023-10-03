
 <!-- http://localhost:8080/etiquetas/bienvenido.html -->
<html>  
<body>  
<%  String name=request.getParameter("name"); 
out.print("<p>"); 
out.print("Bienvenido "+name); 
out.print("</p>"); %>                                    <!-- scriptlet tag para escribir codigo directamente -->

<%! int data=50; %>                                        <!-- JSP declaration tag -->

<p>Hora: <%= java.util.Calendar.getInstance().getTime() %></p>  <!-- JSP expression tag -->
<p><%= "Hola "+request.getParameter("name") %></p>          <!-- JSP expression tag -->
<p><%= "El numero es:"+data %> </p>

<%@ page import="java.util.Date" %>                        <!-- directiva, dice que cuando se genere el servlet ponga un import -->
<p>Hoy es: <%= new Date() %></p>  

</form>  
</body>  
</html> 