package org.ruben.jsp.filtros;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
 
//@WebListener la anotacion para no usarlo en web.xml
public class ContextoListener implements ServletContextListener {
 
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("aplicacion web arrancada "+sce.getServletContext().getContextPath());
 
    }
 
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("aplicacion web parada");
    }
 
}

