package org.ruben.jsp.mapear;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;


public class Inicio extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.init();
    }

    @Override
    public void init()
    {
        System.out.println("configuracion de inicio");
    }

    

}

