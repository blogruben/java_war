package com.ruben.java.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public static List<Usuario> getRecordsPage(int start,int total){  
        List<Usuario> list=new ArrayList<Usuario>();  
        System.out.println("Inicio - getRecordsPaginado( " + start +" , "+ total+" )");
        try (Connection con = PoolJDBC.getConnection()) {
            PreparedStatement ps=con.prepareStatement("select * from user limit "+(start-1)+","+total);  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("name"));
                u.setContrasena(rs.getString("password"));
                u.setEmail(rs.getString("email"));
                u.setGenero(rs.getString("sex"));
                u.setPais(rs.getString("country"));
                list.add(u);
            }  
            con.close();  
        }catch(Exception e){
            System.out.println("Error "+e);
        }  
        System.out.println("Fin - getRecordsPaginado( " + start +" , "+ total+" )");
        return list;  
    }  
    
}