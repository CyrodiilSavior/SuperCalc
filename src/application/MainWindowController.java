package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//This is a change
public class MainWindowController {
	int screenNumber = 0;
	
    @FXML
    private Button buttonDown;

    @FXML
    private Button buttonUp;

    @FXML
    private Label screen;

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

}
