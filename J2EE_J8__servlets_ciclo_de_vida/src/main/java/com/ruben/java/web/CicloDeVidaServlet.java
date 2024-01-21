package com.ruben.java.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cicloDeVida")
public class CicloDeVidaServlet extends HttpServlet {

  private Properties properties;

  @Override
  public void init(ServletConfig conf) throws ServletException {
    super.init(conf);
    // El metodo init() solo es llamado una vez.
    // Solo cuando el servlet es creado y no es la llamadas posteriores.
    // Se usa para cargar las propiedades configuraciones
    System.out.println("Creamos el servlet");
  }

  // The service () method is called by the container and service method invokes
  // doGet, doPost, doPut, doDelete
  @Override
  public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    // El metodo service() es llamado por el contenedor y dependiendo de la peticion
    // (GET, POST, PUT, DELETE ...)
    // llamamos a los metodos doGet, doPost, doPut, doDelete
    System.out.println("Ejecutamos el service para manejar la peticion");
    super.service(request, response);
  }

  /*
   * http://localhost:8080/cicloDeVida
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

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) {
    // Peticion de tipo POST, para dar de alta un articulo
  }

  @Override
  public void doPut(HttpServletRequest request, HttpServletResponse response) {
    // Peticion de tipo PUT, para actualizar un articulo
  }

  @Override
  public void doDelete(HttpServletRequest request, HttpServletResponse response) {
    // Peticion de tipo DELETE, para eliminar un articulo
  }


  @Override
  protected void doTrace(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    // Peticion de tipo TRACE es usado para depurar
  }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    // Peticion de tipo HEAD solo devuelve HEAD sin cuerpo
  }

  @Override
  public void destroy() {
    // El metodo destroy() es llamado una sola vez en el ciclo de vida de los servlets por el servlet-container en el momento que el servlet se cierra.
    // Se usa para cerrar recursos bbdd
  }


  @Override
  public void finalize() {
     //finalize() es llamado por JVM antes de que garbage-collector pida el objeto (no hay ninguna garantia de que que esto pase).
  }


  
}