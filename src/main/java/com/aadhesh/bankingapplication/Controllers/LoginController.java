package com.aadhesh.bankingapplication.Controllers;

import com.aadhesh.bankingapplication.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

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
        login_button.setOnAction(actionEvent -> Model.getInstance().getViewFactory().showClientWindow());
    }
}
