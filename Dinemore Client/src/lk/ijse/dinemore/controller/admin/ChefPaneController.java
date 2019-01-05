package lk.ijse.dinemore.controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import lk.ijse.dinemore.common.NotificationController;
import lk.ijse.dinemore.model.ChefDTO;
import lk.ijse.dinemore.proxy.ProxyHanlder;
import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.custom.ChefService;

import java.net.URL;
import java.util.ResourceBundle;

public class ChefPaneController implements Initializable {

    @FXML
    private TextField txtChefID;

    @FXML
    private TextField txtChefName;

    @FXML
    private TextField txtChefAddress;

    @FXML
    private TextField txtChefSalary;

    @FXML
    private TextField txtChefTelephone;

    private static ChefService chefService;

    @FXML
    void bntSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnChefRemoveOnAction(ActionEvent event) {

    }

    @FXML
    void btnChefSaveOnAction(ActionEvent event) throws Exception {

        chefService = (ChefService) ProxyHanlder.getInstance().getService(ServiceFactory.ServiceTypes.CHEF);

        String chefID = txtChefID.getText();
        String chefName = txtChefName.getText();
        String chefAddress = txtChefAddress.getText();
        Double chefSalary = Double.parseDouble(txtChefSalary.getText());
        String tp = txtChefTelephone.getText();

        ChefDTO chefDTO = new ChefDTO(chefID, chefName, chefAddress, chefSalary, tp);

        System.out.println(chefDTO);

        boolean result = chefService.addChef(chefDTO);

        if (result) {
            NotificationController.createSuccesful("Customer Added Successfully","Added");
        }else {
            NotificationController.createError("Something Went Wrong !","Check Again ...");
        }

    }

    @FXML
    void btnChefUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void txtChefIDSearchArea(ActionEvent event) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
