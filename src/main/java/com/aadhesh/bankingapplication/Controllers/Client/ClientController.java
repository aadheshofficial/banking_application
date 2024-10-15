package com.aadhesh.bankingapplication.Controllers.Client;

import com.aadhesh.bankingapplication.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public BorderPane client_parent;
    private final AnchorPane transaction = Model.getInstance().getViewFactory().getTransactionView();
    private final AnchorPane dashboard = Model.getInstance().getViewFactory().getDashboardView();
    private final AnchorPane account = Model.getInstance().getViewFactory().getAccountView();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal){
                case "Transaction" -> client_parent.setCenter(transaction);
                case "Account" -> client_parent.setCenter(account);
                default -> client_parent.setCenter(dashboard);
            }
        });
    }
}
