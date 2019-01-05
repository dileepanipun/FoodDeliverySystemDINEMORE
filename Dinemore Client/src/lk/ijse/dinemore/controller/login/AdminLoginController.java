package lk.ijse.dinemore.controller.login;

import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.net.URL;

public class AdminLoginController implements Initializable {

    @FXML
    private Label lblTitile;

    @FXML
    private JFXButton btnClose;

    @FXML
    private JFXButton btnMinimize;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private ImageView imageID;

    @FXML
    private JFXRadioButton rbtnReception;

    @FXML
    private JFXRadioButton rbtnChef;

    @FXML
    private JFXRadioButton rbtnDeliverer;

    @FXML
    void cancelOnAction(ActionEvent event) {

    }

    @FXML
    void loginOnaction(ActionEvent event) throws Exception {

        AnchorPane load = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/admin/MainPanel.fxml"));
        Scene scene = new Scene(load);
        Stage stage = (Stage) this.btnLogin.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    @FXML
    void stageClose(ActionEvent event) {

        System.exit(0);

    }

    @FXML
    void stageMinimize(ActionEvent event) {

        Stage stage = (Stage) btnMinimize.getScene().getWindow();
        stage.setIconified(true);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
