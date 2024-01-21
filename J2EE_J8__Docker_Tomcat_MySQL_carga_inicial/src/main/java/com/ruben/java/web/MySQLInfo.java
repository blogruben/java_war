package com.ruben.java.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

        Connection conn = null;
        PreparedStatement ps = null;
        try {

            String mysqldatabase = System.getProperty("MYSQL_DATABASE");
            String mysqluser = System.getProperty("MYSQL_USER");
            String mysqlpass = System.getProperty("MYSQL_PASSWORD");

            out.println("<p> MYSQL_DATABASE ->"+mysqldatabase+"</p>");
            out.println("<p> MYSQL_USER ->"+mysqluser+"</p>");
            out.println("<p> MYSQL_PASSWORD ->"+mysqlpass+"</p>");

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://db:3306/"+mysqldatabase, mysqluser, mysqlpass);
            out.println("<p> Connection ->"+conn+"</p>");

            ResultSet rs = null;            
            String query = "SELECT * FROM Persona ";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                out.println("<p>[ PersonID-");
                out.println(rs.getInt("PersonID"));
                out.println(" LastName-");
                out.println(rs.getString("LastName"));
                out.println(" FirstName-");
                out.println(rs.getString("FirstName")+" ]</p>");
            }

        } catch (Exception  e) {
            out.println("Error ->"+e.fillInStackTrace());
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                out.println("Error ->"+e.fillInStackTrace());
            }
        }  
        out.println("<p>FIN MYSQL</p>");
    }

 

    
}

