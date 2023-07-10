package com.ruben.java.web;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp.BasicDataSource;

public class PoolJDBC {
    
    private static BasicDataSource ds = new BasicDataSource();
    
    private PoolJDBC(){ }

    static {
        ds.setUrl("jdbc:h2:mem:test"); //mem (db en memory) file (en fichero)
        ds.setUsername("user");
        ds.setPassword("password");
        ds.setMinIdle(5);
        ds.setMaxIdle(10);
        ds.setMaxOpenPreparedStatements(100);
    }
    
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    
}
