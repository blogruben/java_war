package com.ruben.java.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Hola {
   private String saludo = "Hola mundo!!";

   public String getSaludo() {
      return saludo;
   }

   public void setSaludo(String saludo) {
      this.saludo = saludo;
   }

}