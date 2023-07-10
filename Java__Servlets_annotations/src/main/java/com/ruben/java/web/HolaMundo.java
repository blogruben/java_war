package com.ruben.java.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;


@WebServlet("/hola")
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