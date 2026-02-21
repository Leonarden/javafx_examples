module com.daizcone.apps.javafx.training {

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;

    
    opens com.daizcone.apps.javafx.training to javafx.fxml,javafx.controls,javafx.base;
       

    
}