package lk.ijse.dinemore.controller.admin;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.dinemore.common.NotificationController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPanelController implements Initializable {

    @FXML
    private JFXButton btnLogout;

    @FXML
    private JFXButton btnClose;

    @FXML
    private JFXButton btnMinimize;

    @FXML
    private Label labelDate;

    @FXML
    private Label labelTime;

    @FXML
    private AnchorPane panelLoader;

    @FXML
    void chefPane(ActionEvent event) throws Exception {

        AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/ChefPane.fxml"));
        panelLoader.getChildren().setAll(devicePane);

    }

    @FXML
    void customerPane(ActionEvent event) throws Exception {

        AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/CustomerPane.fxml"));
        panelLoader.getChildren().setAll(devicePane);

    }

    @FXML
    void delivererPane(ActionEvent event) throws Exception {

        AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/DelivererPane.fxml"));
        panelLoader.getChildren().setAll(devicePane);

    }

    @FXML
    void foodItemPane(ActionEvent event) throws Exception {

        AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/FoodItemPane.fxml"));
        panelLoader.getChildren().setAll(devicePane);

    }

    @FXML
    void homepane(ActionEvent event) throws Exception {

        AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/HomePane.fxml"));
        panelLoader.getChildren().setAll(devicePane);

    }

    @FXML
    void logout(ActionEvent event) throws Exception{

        AnchorPane loginPane = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/login/AdminLogin.fxml"));
        Scene scene = new Scene(loginPane);
        Stage stage = (Stage) this.btnLogout.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    @FXML
    void orderpane(ActionEvent event) throws Exception {

        AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/OrderPane.fxml"));
        panelLoader.getChildren().setAll(devicePane);

    }

    @FXML
    void receptionPane(ActionEvent event) throws Exception {

        AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/ReceptionPane.fxml"));
        panelLoader.getChildren().setAll(devicePane);

    }

    @FXML
    void reportsPane(ActionEvent event) throws Exception {

        AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/ReportsPane.fxml"));
        panelLoader.getChildren().setAll(devicePane);

    }

    @FXML
    void settingsPane(ActionEvent event) throws Exception {

        AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/SettingsPane.fxml"));
        panelLoader.getChildren().setAll(devicePane);

    }

    @FXML
    void stageClose(ActionEvent event) {

        if (ButtonType.OK == NotificationController.createConfigAlert()){

            System.exit(0);

        }

    }

    @FXML
    void stageMinimize(ActionEvent event) {

        Stage stage = (Stage) btnMinimize.getScene().getWindow();
        stage.setIconified(true);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {

            AnchorPane devicePane = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/HomePane.fxml"));
            panelLoader.getChildren().setAll(devicePane);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
