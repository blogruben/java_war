package com.ruben.java.web.customConverter;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData1", eager = true)
@SessionScoped
public class UserData1 implements Serializable {

   private static final long serialVersionUID = 1L;
   public UrlData data;

   public UrlData getData() {
      return data;
   }

   public void setData(UrlData data) {
      this.data = data;
   }	
}