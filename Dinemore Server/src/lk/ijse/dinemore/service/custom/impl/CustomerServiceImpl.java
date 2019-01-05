package lk.ijse.dinemore.service.custom.impl;

import lk.ijse.dinemore.business.BOFactory;
import lk.ijse.dinemore.business.custom.CustomerBO;
import lk.ijse.dinemore.model.CustomerDTO;
import lk.ijse.dinemore.observe.Observer;
import lk.ijse.dinemore.observe.Subject;
import lk.ijse.dinemore.reservation.Reservation;
import lk.ijse.dinemore.service.custom.CustomerService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService, Subject {

    private CustomerBO customerBO;

    private static ArrayList<Observer> allObservers = new ArrayList<>();

//    private static Reservation

    public CustomerServiceImpl() throws RemoteException {

        customerBO = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);

    }

    @Override
    public void registerObserver(Observer var1) throws Exception {

//        allObservers.add(var1);

    }

    @Override
    public void unregisterObserver(Observer var1) throws Exception {

//        allObservers.remove(var1);

    }

    @Override
    public void notifyObservers() throws Exception {

        new Thread(() -> {
            for (Observer observer : allObservers) {
                try{
                    observer.updateObserver();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }

    @Override
    public void updateObserver() throws Exception {

    }

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {

        boolean result = customerBO.addCustomer(customerDTO);

        notifyObservers();

        return result;

    }

    @Override
    public boolean reserve(Object varl) throws Exception {
        return false;
    }

    @Override
    public boolean release(Object varl) throws Exception {
        return false;
    }
}
