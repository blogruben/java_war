package com.ruben.java.web;

import java.sql.*;
import javax.servlet.http.HttpServlet;
import com.ruben.java.web.bean.Usuario;

public class UserDao extends HttpServlet{

    public static int save(Usuario u) {
        int status = 0;
        System.out.println("Inicio - save ");
        System.out.println(u);
        try (Connection con = PoolJDBC.getConnection()) {
            PreparedStatement ps = con.prepareStatement("insert into user(name,password,email,sex,country) values(?,?,?,?,?)");
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getContrasena());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getGenero());
            ps.setString(5, u.getPais());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Fin - save ");
        return status;
    }
}