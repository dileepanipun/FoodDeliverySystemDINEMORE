package lk.ijse.dinemore.controller.reception;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.dinemore.common.NotificationController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReceptionMainPaneController implements Initializable {

    @FXML
    private JFXButton btnLogout;

    @FXML
    private JFXButton btnClose;

    @FXML
    private JFXButton btnMinimize;

    @FXML
    private AnchorPane panelLoader;

    @FXML
    void customerPane(ActionEvent event) {

    }

    @FXML
    void logout(ActionEvent event) throws IOException {

        ButtonType configAlert = NotificationController.createConfigAlert();

        if (ButtonType.OK == configAlert){

            AnchorPane loginPane = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/login/ReceptionLogin.fxml"));
            Scene scene = new Scene(loginPane);
            Stage stage = (Stage) this.btnLogout.getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();

        }

    }

    @FXML
    void manageOrder(ActionEvent event) {

    }

    @FXML
    void orderpane(ActionEvent event) throws Exception {

        AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/reception/PlacceOrder.fxml"));
        panelLoader.getChildren().setAll(devicePane);

    }

    @FXML
    void settingsPane(ActionEvent event) {

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

            AnchorPane devicePane =  FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/reception/PlacceOrder.fxml"));
            panelLoader.getChildren().setAll(devicePane);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
