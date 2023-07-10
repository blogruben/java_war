package com.ruben.java.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



@WebServlet("/getUsers")
public class VerUsuarios extends HttpServlet {
    

	/*
	 * http://localhost:8080/getUsers
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException    {
      
        try(Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "", "");
        Statement stmt = conn.createStatement()) {
        Class.forName("org.h2.Driver");
        ResultSet rs = stmt.executeQuery("SELECT * FROM user");
        while (rs.next()) {
            resp.getWriter().println("Usuario -> id:" + rs.getInt("ID") + " name:" + rs.getString("NOMBRE"));
        }

        } catch (ClassNotFoundException | SQLException e) {
            resp.getWriter().println("Error "+e.getMessage());
        }

    }




}







