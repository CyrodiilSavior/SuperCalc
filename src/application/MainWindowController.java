package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
//This is a change
public class MainWindowController {
	int screenNumber = 0;
	
	@FXML
	private AnchorPane anchorPane;
	
	@FXML
	private Button button_clear;

    @FXML
    private Button buttonDown;

    @FXML
    private Button button_equals;

    @FXML
    private Label screen;

    @FXML
    private Button buttonDiv;
    
    @FXML
    private Button buttonMult;
    
    @FXML
    private Button buttonUp;
   
    @FXML
    private Button button_0;
    
    @FXML
    private Button button_1;
    
    @FXML
    private Button button_2;

    @FXML
    private Button button_3;

    @FXML
    private Button button_4;

    @FXML
    private Button button_5;

    @FXML
    private Button button_6;

    @FXML
    private Button button_7;

    @FXML
    private Button button_8;

    @FXML
    private Button button_9;

    

    @FXML
    void onClick_eq(ActionEvent event) {

    }

    @FXML
    void onClick_up(ActionEvent event) {
    	screenNumber++;
    	screen.setText(new String(""+screenNumber));
    }

    @FXML
    void onClick_down(ActionEvent event) {
    	screenNumber--;
    	screen.setText(new String(""+screenNumber));
    }

    @FXML
    void onClick_div(ActionEvent event) {

    }

    @FXML
    void onClick_mult(ActionEvent event) {

    }
    
    @FXML
    void onClick_clea(ActionEvent event) {

    }

    @FXML
    void onClick_one(ActionEvent event) {

    }

    @FXML
    void onClick_two(ActionEvent event) {

    }

    @FXML
    void onClick_three(ActionEvent event) {

    }

    @FXML
    void onClick_four(ActionEvent event) {

    }

    @FXML
    void onClick_five(ActionEvent event) {

    }

    @FXML
    void onClick_six(ActionEvent event) {

    }

    @FXML
    void onClick_seven(ActionEvent event) {

    }

    @FXML
    void onClick_eight(ActionEvent event) {

    }

    @FXML
    void onClick_nine(ActionEvent event) {

    }



}
