package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.model.CustomerDTO;

import java.util.List;

public interface CustomerBO extends SuperBO {

    public boolean addCustomer(CustomerDTO customer) throws Exception;

    public boolean deleteCustomer(CustomerDTO customer) throws Exception;

    public boolean deleteCustomer(String customerID) throws Exception;

    public List<CustomerDTO> getAllCustomers() throws Exception;

}
