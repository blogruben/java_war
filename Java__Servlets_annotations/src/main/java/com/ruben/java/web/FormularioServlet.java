package com.ruben.java.web;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "FormServlet", urlPatterns = "/calculateServlet")
public class FormularioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String ancho = request.getParameter("ancho");
        String alto = request.getParameter("alto");
        double area;
        try {
            area = calcularArea(Double.parseDouble(alto), Double.parseDouble(ancho));
        } catch (NumberFormatException e) {
            area = 0;
        }
       
        
      Enumeration paramNames = request.getParameterNames();
      while(paramNames.hasMoreElements()) {
        String paramName = (String)paramNames.nextElement();
        String[] paramValues = request.getParameterValues(paramName);

      }
             
        this.log("sin_decimales: "+request.getParameter("sin_decimales"));
        this.log("con_decimales: "+request.getParameter("con_decimales"));
        this.log("ancho: "+request.getParameter("ancho"));
        this.log("alto: "+request.getParameter("alto"));
        this.log("--------------------------");


        request.setAttribute("area", area);
        response.setHeader("Test", "Success");
        response.setHeader("AREA", String.valueOf(area));
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }



    private Double calcularArea(Double weight, Double height) {
        return weight * height;
    }
}