package com.ruben.java.web.applicationEvents;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ComponentSystemEvent;

@ManagedBean(name = "userData2", eager = true)
@SessionScoped
public class UserData2 implements Serializable {
   private static final long serialVersionUID = 1L;
   private String data = "sample data";
	
   public void handleEvent(ComponentSystemEvent event) {
      data = "Hello World";
   }

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }
}