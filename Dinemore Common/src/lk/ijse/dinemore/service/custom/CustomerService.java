package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.model.CustomerDTO;
import lk.ijse.dinemore.service.SuperService;

public interface CustomerService extends SuperService {

    public boolean addCustomer(CustomerDTO customerDTO) throws Exception;

}
