package com.ruben.java.web;

import java.io.Serializable;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "paramData", eager = true)
@SessionScoped
public class ParamData implements Serializable {
   private static final long serialVersionUID = 1L;
   public String data = "1";

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   public String showResult() {
      FacesContext fc = FacesContext.getCurrentInstance();
      Map<String,String> params = 
         fc.getExternalContext().getRequestParameterMap();
      data =  params.get("username"); 
      return "result/resultParam";
   }

   public void attributeListener(ActionEvent event) {
      data = (String)event.getComponent().getAttributes().get("username");	
   }

   
}