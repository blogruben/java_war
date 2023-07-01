package com.ruben.java.web;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name="InitializeResources", urlPatterns="/cargaInicial", loadOnStartup=1)
public class InitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.init();
    }

    @Override
    public void init()
    {
        this.log("Inicio JSP");
    }

}

