package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.CustomerBO;
import lk.ijse.dinemore.entity.Customer;
import lk.ijse.dinemore.model.CustomerDTO;
import lk.ijse.dinemore.repository.RepositoryFactory;
import lk.ijse.dinemore.repository.custom.CustomerRepository;
import lk.ijse.dinemore.resource.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class CustomerBOImpl implements CustomerBO {

    private CustomerRepository customerRepository;

    public CustomerBOImpl(){

        this.customerRepository = (CustomerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CUSTOMER);

    }

    @Override
    public boolean addCustomer(CustomerDTO customer) throws Exception {

         try( Session session = HibernateUtil.getSessionFactory().openSession();) {
             customerRepository.setSession(session);
             session.beginTransaction();


             Customer custEntity = new Customer(
                     customer.getTelephone(),
                     customer.getName(),
                     customer.getAddress(),
                     customer.getNic()
             );

             boolean result = customerRepository.save(custEntity);

             session.getTransaction().commit();

             return result;
         }
    }

    @Override
    public boolean deleteCustomer(CustomerDTO customer) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCustomer(String customerID) throws Exception {
        return false;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() throws Exception {
        return null;
    }
}
