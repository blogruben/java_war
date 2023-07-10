package com.ruben.java.web.bean;


public class Usuario {  
private int id;  
private String nombre,contrasena,email,genero,pais;  
public Usuario() {
}
public Usuario(String nombre, String contrasena, String email, String genero, String pais) {
    this.nombre = nombre;
    this.contrasena = contrasena;
    this.email = email;
    this.genero = genero;
    this.pais = pais;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getContrasena() {
    return contrasena;
}
public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getGenero() {
    return genero;
}
public void setGenero(String genero) {
    this.genero = genero;
}
public String getPais() {
    return pais;
}
public void setPais(String pais) {
    this.pais = pais;
}
@Override
public String toString() {
    return "Usuario [id=" + id + ", nombre=" + nombre + ", contrasena=" + contrasena + ", email=" + email + ", genero="
            + genero + ", pais=" + pais + "]";
}




}  