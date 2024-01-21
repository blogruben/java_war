package com.ruben.java.web.actionListener;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "userData1", eager = true)
@SessionScoped
public class UserData1 implements Serializable {
   private static final long serialVersionUID = 1L;
   private String data = "sample data";
	
   public String showResult() {
      return "actionListenerResultado";
   }

   public void updateData(ActionEvent e) {
      data="Hello World";
   }

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }
}