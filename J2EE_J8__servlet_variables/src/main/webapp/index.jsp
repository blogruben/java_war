 <!-- http://localhost:8080/welcome -->
 <html>  
    <body>  
        <%        
    	String user = getServletContext().getInitParameter("DBUSER");    
    	String pass = getServletContext().getInitParameter("DBPWD");

        out.print("<p> user = "+user+"</p>");
        out.print("<p> pass = "+pass+"</p>"); 

        %> 
    </body>  
</html>  
