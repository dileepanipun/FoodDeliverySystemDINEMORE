package lk.ijse.dinemore.proxy;

import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.SuperService;
import lk.ijse.dinemore.service.custom.ChefService;
import lk.ijse.dinemore.service.custom.CustomerService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ProxyHanlder implements ServiceFactory {

    private static ProxyHanlder proxyHanlder;
    private ServiceFactory serviceFactory;
    private CustomerService customerService;
    private ChefService chefService;

    public ProxyHanlder() {

        try {
            serviceFactory = (ServiceFactory) Naming.lookup("rmi://127.0.0.1:6060/Dinemore");
            customerService = (CustomerService) serviceFactory.getService(ServiceTypes.CUSTOMER);
            chefService = (ChefService) serviceFactory.getService(ServiceTypes.CHEF);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ProxyHanlder getInstance() {

        if (proxyHanlder == null) {
            proxyHanlder = new ProxyHanlder();
        }
        return proxyHanlder;
    }

    @Override
    public SuperService getService(ServiceTypes varl) throws Exception {

        switch (varl){
            case CUSTOMER:
                return customerService;
            case CHEF:
                return chefService;
                default:
                    return null;
        }

    }

}
