package application;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
    private Label myScreen = new Label();

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

    
    
    private double masterNumber = 0;
    private ArrayList<Double> nums = new ArrayList();
    private String lastButtonPressed;
    private int numCalcs = 0;
    boolean mode = true;
    
    void addText(String textToAdd){
    	myScreen.setText(myScreen.getText() + textToAdd);
    }
    
    void newLine(){
    	myScreen.setText(myScreen.getText() + "\n");
    }
    
    

    @FXML
    void onClick_eq(ActionEvent event) {
    	if(nums != null){
    		if(lastButtonPressed.equals("add")){
    			System.out.println("Adding " + (myScreen.getText().substring(myScreen.getText().lastIndexOf("\n")+1, myScreen.getText().length())));
    	    	nums.add(Double.parseDouble((myScreen.getText().substring(myScreen.getText().lastIndexOf("\n")+1, myScreen.getText().length()))));
    	    	System.out.println(masterNumber + "adding" + nums.get(numCalcs));
    	    	masterNumber = masterNumber + nums.get(numCalcs);
        		newLine();
        		addText("" + masterNumber);
    		}

    	}
    }

    @FXML
    void onClick_add(ActionEvent event){
    	lastButtonPressed = "add";
    	System.out.println("Adding " + (myScreen.getText().substring(myScreen.getText().lastIndexOf("\n")+1, myScreen.getText().length())));
    	nums.add(Double.parseDouble((myScreen.getText().substring(myScreen.getText().lastIndexOf("\n")+1, myScreen.getText().length()))));
    	System.out.println(masterNumber + "adding" + nums.get(numCalcs));
    	masterNumber = masterNumber + nums.get(numCalcs);
    	numCalcs++;
    	newLine();
    }
    
    @FXML
    void onClick_sub(ActionEvent event){
    	lastButtonPressed = "sub";
    	System.out.println("Adding " + (myScreen.getText().substring(myScreen.getText().lastIndexOf("\n")+1, myScreen.getText().length())));
    	nums.add(Double.parseDouble((myScreen.getText().substring(myScreen.getText().lastIndexOf("\n")+1, myScreen.getText().length()))));
    	masterNumber = masterNumber * nums.get(numCalcs);
    	numCalcs++;
    	newLine();

    }
    
    @FXML
    void onClick_menu(ActionEvent event){
    	myScreen.setText("");
    	addText("SELECT AN OPTION:");
    	addText("\n"+"\n"+"\n"+"\n"+"\n"+"\n"
    	);
    }
    
    @FXML
    void onClick_Up(ActionEvent event) {
;
    }

    @FXML
    void onClick_down(ActionEvent event) {
    }

    @FXML
    void onClick_div(ActionEvent event) {
    	lastButtonPressed = "div";
    	System.out.println("Adding " + (myScreen.getText().substring(myScreen.getText().lastIndexOf("\n")+1, myScreen.getText().length())));
    	nums.add(Double.parseDouble((myScreen.getText().substring(myScreen.getText().lastIndexOf("\n")+1, myScreen.getText().length()))));
    	masterNumber = masterNumber / nums.get(numCalcs);
    	numCalcs++;
    	newLine();
    }

    @FXML
    void onClick_mult(ActionEvent event) {
    	lastButtonPressed = "mult";
    	System.out.println("Adding " + (myScreen.getText().substring(myScreen.getText().lastIndexOf("\n")+1, myScreen.getText().length())));
    	nums.add(Double.parseDouble((myScreen.getText().substring(myScreen.getText().lastIndexOf("\n")+1, myScreen.getText().length()))));
    	
    	numCalcs++;
    	newLine();
    }
    
    @FXML
    void onClick_clea(ActionEvent event) {
    	myScreen.setText("");
    	masterNumber = 0;
    	numCalcs = 0;
    	nums = new ArrayList();
    }

    @FXML
    void onClick_one(ActionEvent event) {
    	addText("1");

    }

    @FXML
    void onClick_two(ActionEvent event) {
    	addText("2");

    }

    @FXML
    void onClick_three(ActionEvent event) {
    	addText("3");

    }

    @FXML
    void onClick_four(ActionEvent event) {
    	addText("4");

    }

    @FXML
    void onClick_five(ActionEvent event) {
    	addText("5");

    }

    @FXML
    void onClick_six(ActionEvent event) {
    	addText("6");

    }

    @FXML
    void onClick_seven(ActionEvent event) {
    	addText("7");

    }

    @FXML
    void onClick_eight(ActionEvent event) {
    	addText("8");

    }

    @FXML
    void onClick_nine(ActionEvent event) {
    	addText("9");

    }
    
    @FXML
    void onClick_zero(ActionEvent event){
    	addText("0");

    }



}
