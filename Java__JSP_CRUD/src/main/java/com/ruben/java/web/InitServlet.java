package com.ruben.java.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.ruben.java.web.bean.Usuario;


@WebServlet(name="InitializeResources", urlPatterns="/cargaInicial", loadOnStartup=1)
public class InitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.init();
    }

    @Override
    public void init()
    {
        crearEsquemas();
        cargarDatosIniciales();
    }

    private void crearEsquemas() {
        this.log("Inicio - crear esquemas");
        final String crearTabla = "CREATE TABLE IF NOT EXISTS user(id MEDIUMINT NOT NULL AUTO_INCREMENT ,name varchar(255) ,password varchar(255),email varchar(255),sex varchar(255),country varchar(255))";
        try(Connection conn = PoolJDBC.getConnection();
        PreparedStatement pstmtCreate = conn.prepareStatement(crearTabla);) {
            pstmtCreate.execute();
        } catch (SQLException e) {
            this.log("Error "+e);
        }
        this.log("Fin - crear esquemas");
    }

    private void cargarDatosIniciales() {
        this.log("Inicio - carga de datos inicial");
        UserDao.save(new Usuario("Raul", "123","raul@mail.es","M","Espana"));
        UserDao.save(new Usuario("Roberto", "123","roberto@mail.es","M","Espana"));
        UserDao.save(new Usuario("Ricardo", "123","ricardo@mail.es","M","Espana"));
        UserDao.save(new Usuario("Rosa", "123","rosa@mail.es","F","Espana"));
        UserDao.save(new Usuario("Roxana", "123","roxana@mail.es","F","Espana"));
        UserDao.save(new Usuario("Rolando", "123","rolando@mail.es","M","Espana"));
        this.log("Fin - carga de datos inicial");
    }

}

