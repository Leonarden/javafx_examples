package org.openjfx.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * JavaFX Example  App
 */
public class App extends Application {

    public static Scene scene;

    static final String SMILE= ":)";
   
    static final String SAD = ":(";
    
    static final String FROZEN = ":/";
    
    public static String kindOfMood;
   
    static String params="";
    
    
    public static void main(String[] args) {
    	params = args.toString();
        App.launch(args);
    }
    
    
    @Override
    public void init() throws IOException {
    	
    	System.err.println("PARAMS = " + params);
    	if(!params.isEmpty())
    		App.kindOfMood = params;
    	else
    		App.kindOfMood = "Dark now " + App.SAD  +" !";
    	
    	System.err.println("KINDOFMOOD = " + kindOfMood);
        
    }
    
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        
    	scene.setRoot(loadFXML(fxml));
    	//log App.kindOfMood
    	System.err.println("App.kindOfMood = " + App.kindOfMood);
    }

    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void switchKindOfMood() {
    	int cmood = (int) (Math.random() * 3);
    	
    	if(App.kindOfMood.contains(App.SMILE)) {
    		App.kindOfMood = "Dark now " + App.SAD  + " !";
    	}else if(App.kindOfMood.contains(App.SAD)) {
    		App.kindOfMood = "Bright now " + App.SMILE  + " !";
    	}else {
    		//
    		switch(cmood) {
    		case 0:
    			App.kindOfMood = "Dark now " + App.SAD  + " !";
    			break;
    		case 1:
    			App.kindOfMood = "Bright now " + App.SMILE  + " !";
    			break;
    		default:
    			App.kindOfMood="Ooops I'm frozen " + App.FROZEN  + " ! ";
    		}
    	}
    }
    

}