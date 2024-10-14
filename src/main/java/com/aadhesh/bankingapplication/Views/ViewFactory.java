package com.aadhesh.bankingapplication.Views;

import com.aadhesh.bankingapplication.Controllers.Client.ClientController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
//    client view
    private AnchorPane dashboardView;


    public ViewFactory(){

    }
    public AnchorPane getDashboardView(){
        if(dashboardView == null){
            try{
                dashboardView = new FXMLLoader(getClass().getResource("/FXML/Client/Dashboard.fxml")).load();
            } catch (Exception e){
                System.out.println("Error while loading dashboard window "+ e.getMessage());
            }
        }
        return dashboardView;

    }
    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Login.fxml"));
        CreateStage(loader);
    }
    public void showClientWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        CreateStage(loader);

    }
    public void CreateStage(FXMLLoader loader){
        Scene scene = null;
        try{
            scene = new Scene(loader.load());
        } catch (Exception e){
            System.out.println("Error while loading window "+ e.getMessage());
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Phoenix Bank");
        stage.show();
    }
    public void CloseStage(Stage stage){
        stage.close();
    }
}
