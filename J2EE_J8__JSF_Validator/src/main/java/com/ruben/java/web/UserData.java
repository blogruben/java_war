package com.ruben.java.web;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {
   private static final long serialVersionUID = 1L;
   private String name;
   private int age;
   private double salary;
   private String password;
   public String data;

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   public String getPassword() {
      return password;
   }
   
   public void setPassword(String password) {
      this.password = password;
   }   

   public double getSalary() {
      return salary;
   }
   
   public void setSalary(double salary) {
      this.salary = salary;
   }

   public int getAge() {
      return age;
   }
   
   public void setAge(int age) {
      this.age = age;
   }  
  
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }  
}