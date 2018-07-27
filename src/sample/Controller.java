package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Label helloLabel;

    @FXML
    private TextField userNameTextField;

    @FXML
    private Label userLabelForText;

    @FXML TextField userTextFieldVardas;

    @FXML TextField userTextFieldPavarde;

    public void changeNameAndSurname(ActionEvent event){
        String name1 = userTextFieldVardas.getText();
        String surname1 = userTextFieldPavarde.getText();
        userLabelForText.setText(name1+ " "+ surname1);
    }



    public void changeText(ActionEvent event){

        helloLabel.setText("Tekstas pakeistas!");


    }



    public void changeUserName (ActionEvent event){
        String name = userNameTextField.getText();
        userNameTextField.setText("");
        helloLabel.setText(name);

    }

}
