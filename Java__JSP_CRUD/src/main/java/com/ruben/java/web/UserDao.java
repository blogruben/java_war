package com.ruben.java.web;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static int update(Usuario u) {
        int status = 0;
        System.out.println("Inicio - update " + u);
        try (Connection con = PoolJDBC.getConnection()) {
            PreparedStatement ps = con
                    .prepareStatement("update user set name=?,password=?,email=?,sex=?,country=? where id=?");
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getContrasena());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getGenero());
            ps.setString(5, u.getPais());
            ps.setInt(6, u.getId());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
        System.out.println("Fin - update " + u);
        return status;
    }

    public static int delete(Usuario u) {
        int status = 0;
        System.out.println("Inicio - delete " + u);
        try (Connection con = PoolJDBC.getConnection()) {
            PreparedStatement ps = con.prepareStatement("delete from user where id=?");
            ps.setInt(1, u.getId());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
        System.out.println("Fin - delete " + u);
        return status;
    }

    public static List<Usuario> getAllRecords() {
        System.out.println("Inicio - getAllRecords");
        List<Usuario> list = new ArrayList<Usuario>();
        try (Connection con = PoolJDBC.getConnection()) {
            PreparedStatement ps = con.prepareStatement("select * from user");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("name"));
                u.setContrasena(rs.getString("password"));
                u.setEmail(rs.getString("email"));
                u.setGenero(rs.getString("sex"));
                u.setPais(rs.getString("country"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        System.out.println("Fin - getAllRecords");
        return list;
    }

    public static Usuario getRecordById(int id) {
        Usuario u = null;
        System.out.println("Inicio - getRecordById(" + id + ")");
        try (Connection con = PoolJDBC.getConnection()) {
            PreparedStatement ps = con.prepareStatement("select * from user where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("name"));
                u.setContrasena(rs.getString("password"));
                u.setEmail(rs.getString("email"));
                u.setGenero(rs.getString("sex"));
                u.setPais(rs.getString("country"));
            }
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
        System.out.println("Fin - getRecordById(" + id + ")");
        return u;
    }
}