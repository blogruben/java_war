package com.ruben.java.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.*;
import javax.servlet.http.*;

import org.h2.jdbcx.JdbcDataSource;

public class H2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.init();
    }

    @Override
    public void init()
    {
        System.out.println("INICIO H2");
        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "", "");
            System.out.println("Connection ->"+conn);

            JdbcDataSource ds = new JdbcDataSource();
            ds.setURL("jdbc:h2:˜/test");
            ds.setUser("");
            ds.setPassword("");
            System.out.println("JdbcDataSource -> "+ds);

        } catch (Exception  e) {//
            e.printStackTrace();
        }      
        System.out.println("FIN H2");
    }
}

