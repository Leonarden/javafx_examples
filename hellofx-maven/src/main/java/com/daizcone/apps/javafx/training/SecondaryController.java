package com.daizcone.apps.javafx.training;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondaryController {


	@FXML
	private Label secondaryMoodTxt;
	
	@FXML
    public void initialize() {
		//System.out.println("Before update: " + secondaryMoodTxt.getText());
        secondaryMoodTxt.setText(App.kindOfMood);
    }
	
    @FXML
    private void switchToPrimary() throws IOException {
       
    
    	App.switchKindOfMood();
    	
    	App.setRoot("primary");
    	
    }
}