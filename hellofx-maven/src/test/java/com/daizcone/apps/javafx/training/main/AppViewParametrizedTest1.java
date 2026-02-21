package com.daizcone.apps.javafx.training.main;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.daizcone.apps.javafx.training.App;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/* 
This is a parametrized test example for hellofx application. It uses JUnit 5 to test the App class and its behavior with different moods. The test checks the initial mood and then switches it to verify the change.
@note: Intend is to use args at App.launch(args) to pass different moods, 
Without altering too much of the existing code structure.
*/

public class AppViewParametrizedTest1 extends Application {
    

	final static String keyw1 = "--mood=";
	static String [] newArgs = null;
	public static AppViewParametrizedTest1 bapp;
	
    public static App app = null;
    
	public  AppViewParametrizedTest1() {
		app = new App();
	}
    
    
    public static void main(String[] args) {
        // Set the initial mood before launching the application
         /*testing purposes for now */
        List<String> lstnwArgs =  (List<String>) List.of(args).stream()
               .filter(arg -> arg.contains(keyw1)).map(e -> e.toString().substring(keyw1.length())).collect(Collectors.toList());
        
        lstnwArgs.add("Some extra test value-> Very poker face ://");

        newArgs = new String[lstnwArgs.size()];
        
        for(int i=0;i<lstnwArgs.size();i++)
        	newArgs[i] = lstnwArgs.get(i);
        
      
        
       
       app.launch(newArgs);
        
    }

    
    public static void launch(String [] args) {
        
        //app.launch(args);
        
    	
    }
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		app.start(primaryStage);
		
		
	}

	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
		app.init();
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
		app.stop();
	}
       
    
    //pending further implementation
    //  of test methods to verify the behavior of the application with different moods

}
