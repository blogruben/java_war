package com.ruben.java.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "selectData", eager = true)
@SessionScoped
public class SelectData implements Serializable {
   private static final long serialVersionUID = 1L;
   public String[] dataSelectManyCheckbox = {"1","2","3"};
   public String dataSelectOneRadio = "1";
   public String dataSelectOneListbox = "1";
   public String[] dataSelectManyListbox = {"1","2","3"};
   public String dataSelectOneMenu = "1";



   public String[] getDataSelectManyCheckbox() {
      return dataSelectManyCheckbox;
   }

   public void setDataSelectManyCheckbox(String[] dataSelectManyCheckbox) {
      this.dataSelectManyCheckbox = dataSelectManyCheckbox;
   }

   public String getDataSelectOneRadio() {
      return dataSelectOneRadio;
   }

   public void setDataSelectOneRadio(String dataSelectOneRadio) {
      this.dataSelectOneRadio = dataSelectOneRadio;
   }

   public String getDataSelectOneListbox() {
      return dataSelectOneListbox;
   }

   public void setDataSelectOneListbox(String dataSelectOneListbox) {
      this.dataSelectOneListbox = dataSelectOneListbox;
   }

   public String[] getDataSelectManyListbox() {
      return dataSelectManyListbox;
   }

   public void setDataSelectManyListbox(String[] dataSelectManyListbox) {
      this.dataSelectManyListbox = dataSelectManyListbox;
   }

   public String getDataSelectOneMenu() {
      return dataSelectOneMenu;
   }

   public void setDataSelectOneMenu(String dataSelectOneMenu) {
      this.dataSelectOneMenu = dataSelectOneMenu;
   }


   
}