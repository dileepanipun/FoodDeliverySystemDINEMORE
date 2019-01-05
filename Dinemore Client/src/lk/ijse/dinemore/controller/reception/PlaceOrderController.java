package lk.ijse.dinemore.controller.reception;

import com.jfoenix.controls.JFXDatePicker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import lk.ijse.dinemore.common.NotificationController;
import lk.ijse.dinemore.model.CustomerDTO;
import lk.ijse.dinemore.proxy.ProxyHanlder;
import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.custom.CustomerService;

import java.net.URL;
import java.util.ResourceBundle;

public class PlaceOrderController implements Initializable {

    @FXML
    private TextField txtTelephoneNo;

    @FXML
    private TextField txtCustomerName;

    @FXML
    private TextField txtCustomerNIC;

    @FXML
    private TextArea txtCustomerAddress;

    @FXML
    private TextField txtOrderId;

    @FXML
    private TextField txtItemCode;

    @FXML
    private JFXDatePicker dateOrderDate;

    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtOrderAddress;

    @FXML
    private TextField txtQty;

    @FXML
    private TextField txtUnitPrice;

    private static CustomerService customerService;

    @FXML
    void addOrderOnAction(ActionEvent event) {

    }

    @FXML
    void clearOnAction(ActionEvent event) {

    }

    @FXML
    void removeCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void saveCustomerOnAction(ActionEvent event) throws Exception {

        customerService = (CustomerService) ProxyHanlder.getInstance().getService(ServiceFactory.ServiceTypes.CUSTOMER);

        String telephoneNo = txtTelephoneNo.getText();
        String custName = txtCustomerName.getText();
        String custAddress = txtCustomerAddress.getText();
        String custNIC = txtCustomerNIC.getText();

        CustomerDTO customerDTO = new CustomerDTO(telephoneNo,custName,custAddress,custNIC);

        boolean result = customerService.addCustomer(customerDTO);

        if (result) {
            NotificationController.createSuccesful("Customer Added Successfully","Added");
        }else {
            NotificationController.createError("Something Went Wrong !","Check Again ...");
        }

    }

    @FXML
    void serachCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void updateCustomerOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
