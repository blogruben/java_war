package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ruben.java.web.UserDao;
import com.ruben.java.web.bean.Usuario;

public final class editform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("    <title>Edit Form</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("        ");
 String id=request.getParameter("id"); Usuario u=UserDao.getRecordById(Integer.parseInt(id)); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <h1>Edit Form</h1>\r\n");
      out.write("            <form action=\"edituser.jsp\" method=\"post\">\r\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(u.getId() );
      out.write("\" />\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Name:</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"nombre\" value=\"");
      out.print( u.getNombre());
      out.write("\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Password:</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"password\" name=\"contrasena\" value=\"");
      out.print( u.getContrasena());
      out.write("\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Email:</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"email\" name=\"email\" value=\"");
      out.print( u.getEmail());
      out.write("\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Sex:</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"radio\" name=\"genero\" value=\"M\" ");
      out.print( u.getGenero().equals("M") ? "checked" : "" );
      out.write(" />Male\r\n");
      out.write("                            <input type=\"radio\" name=\"genero\" value=\"F\" ");
      out.print( u.getGenero().equals("F") ? "checked" : "" );
      out.write(" />Female\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Country:</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <select name=\"pais\">\r\n");
      out.write("                                <option>Espana</option>\r\n");
      out.write("                                <option>Francia</option>\r\n");
      out.write("                                <option>Alemania</option>\r\n");
      out.write("                                <option>Inglaterra</option>\r\n");
      out.write("                                <option>Otro</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"2\"><input type=\"submit\" value=\"Edit User\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
