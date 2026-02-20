package org.openjfx.hellofx.main;
/*
    * This is a test class for AppViewTest1
Imports JUnit 5 and JavaFX libraries for testing

 */
import org.junit.jupiter.api.Test;
import org.openjfx.hellofx.App;

import static org.junit.jupiter.api.Assertions.*;

public class AppViewTest1 {
 /*
  */
    

    @Test
    public void testAppView() {
        // Create an instance of the App class
        App app = new App();
        
        // Call the init method to set up the initial state
        try {
            app.init();
        } catch (Exception e) {
            fail("Initialization failed: " + e.getMessage());
        }
        
        // Verify that the kindOfMood is set correctly after initialization
        assertEquals("Dark now :( !", app.kindOfMood, "Initial kindOfMood should be 'Dark now :( !'");
        
        // Call the switchKindOfMood method to change the mood
        app.switchKindOfMood();
        
        // Verify that the kindOfMood has switched to the expected value
        assertEquals("Dark now :) !", app.kindOfMood, "After switching, kindOfMood should be 'Dark now :) !'");
    }

}
