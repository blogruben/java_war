package org.ruben.jsp.mapear;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class HolaMundo extends HttpServlet {

  /*
   * http://localhost:8080/hola
   */
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    // Peticion de tipo GET, pedir articulos
    PrintWriter out;
    out = res.getWriter();
    res.setContentType("text/html");
    out.println("");
    out.println("Hola Mundo !!");

  }
  
}