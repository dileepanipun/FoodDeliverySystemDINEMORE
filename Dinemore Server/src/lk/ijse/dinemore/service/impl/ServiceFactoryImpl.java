package lk.ijse.dinemore.service.impl;
import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.SuperService;
import lk.ijse.dinemore.service.custom.impl.ChefServiceImpl;
import lk.ijse.dinemore.service.custom.impl.CustomerServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory {

    public static ServiceFactory serviceFactory;

    private ServiceFactoryImpl() throws RemoteException {
    }

    public static ServiceFactory getInstance() throws RemoteException{

        if (serviceFactory == null) {
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;

    }


    @Override
    public SuperService getService(ServiceTypes varl) throws Exception {

        switch (varl){
            case CUSTOMER:
                return new CustomerServiceImpl();
            case CHEF:
                return new ChefServiceImpl();
                default:
                    return null;
        }
    }
}
