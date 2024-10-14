package com.aadhesh.bankingapplication.Controllers.Client;

import com.aadhesh.bankingapplication.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboard_button;
    public Button transaction_button;
    public Button account_button;
    public Button profile_button;
    public Button logout_button;
    public Button report_button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();

    }
    private void addListeners(){
        dashboard_button.setOnAction(actionEvent -> onDashboard());
        transaction_button.setOnAction(actionEvent -> onTransaction());
        account_button.setOnAction(actionEvent -> onAccount());
    }

    private void onAccount() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Account");
    }

    private void onTransaction() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transaction");
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
    }
}
