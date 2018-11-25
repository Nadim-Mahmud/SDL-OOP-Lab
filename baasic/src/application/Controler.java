package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controler {
	
    @FXML
    private TextArea txt;
	
	public void print(ActionEvent event ) {
		System.out.println(txt.getText());
		txt.appendText("Nadim" + txt.getText() + "\n");
	}

    @FXML
    private Button button;

    @FXML
    void add(MouseEvent event) {
    	//System.out.println(txt.getText());
    }
}
