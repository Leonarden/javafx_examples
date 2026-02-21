package com.daizcone.apps.javafx.training;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class PrimaryController {

	@FXML
	private Label primaryMoodTxt;
	
	@FXML
    public void initialize() {
		//System.out.println("Before update: " + primaryMoodTxt.getText());
		primaryMoodTxt.setText(App.kindOfMood);
    }
	
    @FXML
    private void switchToSecondary() throws IOException {
    	/*
    	 perform something 
    	 */
    
    	App.switchKindOfMood();	
    	
    	App.setRoot("secondary");
    
    }
}
