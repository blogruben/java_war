package com.ruben.java.web;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hola")
public class LlamarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("saludo", "Buenos dias !!");
        request.getRequestDispatcher("llamarServlet/diHola.jsp").forward(request, response);
    }




}