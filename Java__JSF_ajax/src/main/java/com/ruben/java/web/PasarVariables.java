package com.ruben.java.web;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
 
@ManagedBean(name = "pasarVariables", eager = true)
@SessionScoped
public class PasarVariables {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String submit() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        return "pasarVarResultado";
    }

}