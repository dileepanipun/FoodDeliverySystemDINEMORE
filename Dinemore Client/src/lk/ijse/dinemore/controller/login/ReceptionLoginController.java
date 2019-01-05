package lk.ijse.dinemore.controller.login;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ReceptionLoginController implements Initializable {

    @FXML
    private JFXButton btnClose;

    @FXML
    private JFXButton btnMinimize;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private ImageView imageID;

    @FXML
    void cancelOnAction(ActionEvent event) {

    }

    @FXML
    void loginOnaction(ActionEvent event) throws Exception {

        AnchorPane load = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/reception/ReceptionMainPane.fxml"));
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

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
