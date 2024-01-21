package com.ruben.java.web;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class MySQLInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out; out = response.getWriter();
        response.setContentType("text/html");
        out.println("");
        out.println("");
        out.println("<p>INICIO MYSQL</p>");
        try {
            String mysqldatabase = System.getProperty("MYSQL_DATABASE");
            out.println("<p> MYSQL_DATABASE ->"+mysqldatabase+"</p>");

            String mysqluser = System.getProperty("MYSQL_USER");
            out.println("<p> MYSQL_USER ->"+mysqluser+"</p>");

            String mysqlpass = System.getProperty("MYSQL_PASSWORD");
            out.println("<p> MYSQL_PASSWORD ->"+mysqlpass+"</p>");

        } catch (Exception  e) {
            e.printStackTrace();
        }     
        out.println("<p>FIN MYSQL</p>");
    }
}

