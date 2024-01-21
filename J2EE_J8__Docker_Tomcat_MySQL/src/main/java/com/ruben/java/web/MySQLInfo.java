package com.ruben.java.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.*;
import javax.servlet.http.*;



public class MySQLInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out; out = response.getWriter();
        response.setContentType("text/html");
        out.println("<p>INICIO MYSQL</p>");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://contenedorbbdd:3306/bbddName", "root", "my-secret-pw");
            out.println("Connection ->"+conn);
        } catch (Exception  e) {
            e.printStackTrace();
        }      
        out.println("<p>FIN MYSQL</p>");
    }
}

