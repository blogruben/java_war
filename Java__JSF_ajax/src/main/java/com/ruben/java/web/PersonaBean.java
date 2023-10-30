package com.ruben.java.web;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
 
@ManagedBean(name = "personaBean", eager = true)
@SessionScoped
public class PersonaBean {
 
 private String nombre;
 
public String getNombre() {
 return nombre;
 }
 
public void setNombre(String nombre) {
 this.nombre = nombre;
 }
}