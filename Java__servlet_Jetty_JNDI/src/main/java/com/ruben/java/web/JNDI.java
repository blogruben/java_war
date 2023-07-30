package com.ruben.java.web;

import java.io.IOException;
import javax.naming.InitialContext;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.DataSource;

public class JNDI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.init();
    }

    @Override
    public void init()
    {
        System.out.println("INICIO JNDI");
        try {
            InitialContext ic = new InitialContext();
            Integer myInteger = (Integer)ic.lookup("java:comp/env/myInteger");
            System.out.println("myInteger -> "+myInteger);

            String myString = (String)ic.lookup("java:comp/env/myString");
            System.out.println("myString -> "+myString);

            Boolean myBoolean = (Boolean)ic.lookup("java:comp/env/myBoolean");
            System.out.println("myBoolean -> "+myBoolean);

            String myStringGlobal = (String)ic.lookup("java:comp/env/myStringGlobal");
            System.out.println("myStringGlobal -> "+myStringGlobal);

            InitialContext ctx = new InitialContext();
            DataSource db = (DataSource)ctx.lookup("java:comp/env/jdbc/mydb");
            System.out.println("DataSource -> "+db);
            
        } catch (Exception  e) {//
            e.printStackTrace();
        }      
        System.out.println("FIN JNDI");
    }

    

}

