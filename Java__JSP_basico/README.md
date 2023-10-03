
# Arrancar servidor 
``gradle appStart``
ctrl+C para cerrar jetty

H2 genera los archivos test.h2.db y test.trace.db en el directorio home
Para reiniciar la bd borrar estos archivos.

Vamos http://localhost:8080/ 

# URL

| URL                                            |  descripcion                                                        | 
|---------------------------------------------------|----------------------------------------------------------| 
|http://localhost:8080/hola                         | llamamos al servlet http://FormularioServlet.java | 
|http://localhost:8080/verParametros                | llamamos parametroInicio/mostrarVariable.jsp atraves de web.xml | 
|http://localhost:8080/compilar/hola.jsp            | llamamos a jsp directamente | 
|http://localhost:8080/compilar/verURL.jsp          |   | 
|http://localhost:8080/session/session.html         |   | 
|http://localhost:8080/etiquetas/tiposEtiqueta.jsp  |   | 
|http://localhost:8080/depurar/traza.jsp            |   | 
|http://localhost:8080/exception/formulario.html    |   | 

# Compilacion

JSP Java Server Pages se compilan en el directorio raiz
``
gradle build
jar -tf build/libs/Java__JSP.war
> META-INF/MANIFEST.MF
> WEB-INF/classes/com/ruben/java/web/FormularioServlet.class
> WEB-INF/classes/algo.properties
> WEB-INF/lib/h2-1.3.148.jar
> WEB-INF/lib/httpclient-4.5.14.jar
> WEB-INF/lib/httpcore-4.4.16.jar
> WEB-INF/lib/commons-codec-1.11.jar
> hola.jsp
> index.jsp

#-p es para imprimir por pantalla en vez de generar un archivo
unzip -p build/libs/Java__JSP.war hola.jsp
> <html>
> <body>
> <% out.print(2*5); %>
> </body>
> </html>
``

# De JSP a Servlets

La primera vez que se llama a una JSP, el "JSP Translation" genera un servlet.
Se puede en el directorio `build\serverBaseDir_jetty9\webapps-exploded` que se 
generar las clases cuando invocamos un jsp en el Jetty encendido.

Por ejemplo el hola.jsp
> <html>
> <body>
> <% out.print(2*5); %>
> </body>
> </html>

Se traduce en: [hola_jsp.java](hola_jsp.md)



# JSP objetos implicitos

Cuando es invocado la primera vez el JSP, genera el servelt con objetos implicitos, con objetos iniciados en la cabecera del servlet y disponible
en los scriptlet tag del jsp ``<% out.print("Hola"); %> ``

```
PageContext pageContext = _jspxFactory.getPageContext(...);
HttpSession session = pageContext.getSession();
ServletContext application = pageContext.getServletContext();
ServletConfig config = pageContext.getServletConfig();
JspWriter out = pageContext.getOut();
Object page = this;
```
