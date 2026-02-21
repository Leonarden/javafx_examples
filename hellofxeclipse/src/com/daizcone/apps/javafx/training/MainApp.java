package com.daizcone.apps.javafx.training;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {
	 
	static int totalClicksPrimaryCB1;
    
	@Override
	public void init() throws IOException {
		
		totalClicksPrimaryCB1 = 0;
		
	}
	
	@Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

   static void setTotalClicksPrimaryCB1(int clicks) {
	   totalClicksPrimaryCB1 = clicks;
   }
}