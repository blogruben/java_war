package com.ruben.java.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.enterprise.context.SessionScoped;
//import javax.inject.Named;
import org.primefaces.PrimeFaces;


@ManagedBean(name="bean")
@SessionScoped
public class Bean implements Serializable {
   private static final long serialVersionUID = 1L;
   public String valueText = "";


   public void save() {
      PrimeFaces.current().executeScript("alert('This onload script is added from backing bean.')");     
      System.out.println("Ejecutando JS");
   }

   public String getValueText() {
      return valueText;
   }

   public void setValueText(String valueText) {
      this.valueText = valueText;
   }


   
   
}