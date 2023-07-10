package com.ruben.java.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



@WebServlet("/addUser")
public class InsertarUsuario extends HttpServlet {
    

	/*
	 * http://localhost:8080/addUser?name=Raul
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException    {
		String nombre = req.getParameter("name");

        final String crearTabla = "CREATE TABLE IF NOT EXISTS user(id MEDIUMINT NOT NULL AUTO_INCREMENT ,nombre varchar(255))";
        final String insertarUser = "INSERT INTO user(nombre) VALUES(?)";
      
        try(Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "", "")) {
            Class.forName("org.h2.Driver");
            try(PreparedStatement pstmtCreate = conn.prepareStatement(crearTabla)){
                pstmtCreate.execute();
            }
            try(PreparedStatement pstmtInsert = conn.prepareStatement(insertarUser)){
                pstmtInsert.setString(1, nombre);
                pstmtInsert.executeUpdate();

                ResultSet generatedKeys = pstmtInsert.getGeneratedKeys();
                if (generatedKeys.next()) {
                    resp.getWriter().println("Id: "+generatedKeys.getLong(1));
                }
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
            resp.getWriter().println("Error "+e.getMessage());
        }


    }




}







