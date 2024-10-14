package com.aadhesh.bankingapplication.Controllers;

import com.aadhesh.bankingapplication.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox acc_selector;
    public Label payee_address_label;
    public TextField payee_address_field;
    public PasswordField password_field;
    public Button login_button;
    public Label error_label;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_button.setOnAction(actionEvent -> onLogin());
    }
    private void onLogin(){
        Stage stage = (Stage) login_button.getScene().getWindow();
        Model.getInstance().getViewFactory().CloseStage(stage);
        Model.getInstance().getViewFactory().showClientWindow();
    }
}
