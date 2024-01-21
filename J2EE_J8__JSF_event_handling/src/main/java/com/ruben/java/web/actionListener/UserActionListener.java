package com.ruben.java.web.actionListener;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class UserActionListener implements ActionListener {
   
   @Override
   public void processAction(ActionEvent arg0) 
   throws AbortProcessingException {
      
      //access userData bean directly
      UserData1 userData1 = (UserData1) FacesContext.getCurrentInstance().
      getExternalContext().getSessionMap().get("userData1"); 
      userData1.setData("Hello World");
   }
}