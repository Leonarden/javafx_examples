package com.daizcone.apps.javafx.training;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;



public class FXMLController {
    
    @FXML
    private Label lblc1;

    @FXML
    private Label lblc2;
    
    @FXML
    private Label lblc3;
    static final String SALUTATION="Hello from Java FX!"; 
    
    @FXML
    private Button button1;
    
    
    public void initialize() {
        
    	String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
       
        lblc1.setText(SALUTATION);
        lblc2.setText("Java FX version: "+ javafxVersion + " .");
        lblc3.setText("Java Version " + javaVersion + ".");
    
      
    }    

    /**
     * Simple event handler that will display number of clicks.
     * @param d
     */
    @FXML
    private void handleButton() throws Exception{
    	int v;
    	try {
    	 
    	 String [] clickedStrArr = button1.getText().split("-");
    	 if(clickedStrArr[1].trim().isEmpty())
    		 v = 0;
    	 else 
    		 v = Integer.valueOf(clickedStrArr[1]).intValue();
    	 
    	 MainApp.setTotalClicksPrimaryCB1(v++); //synchronized???
    	 
    	 button1.setText(clickedStrArr[0] + "-" + v + "");
    	
    	 
    	 System.out.println("View-> id: button1 - counter : " + v );
    	
    	}catch(Exception e) {
    		
    		System.err.println("An error occurred: " + e.getLocalizedMessage());
    	}
    	
    	
    } 
    

}