<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<%    
String filename = "prueba.txt";   
ServletContext context = pageContext.getServletContext();
String filePath = context.getInitParameter("rutaRelativa");
this.log("filePath: "+filePath+filename);

response.setContentType("APPLICATION/OCTET-STREAM");   
response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
java.io.FileInputStream fileInputStream=new java.io.FileInputStream(filePath + filename);  
          
int i;   
while ((i=fileInputStream.read()) != -1) {  
    out.write(i);   
}   
fileInputStream.close();   
%>   
    
</body>
</html>