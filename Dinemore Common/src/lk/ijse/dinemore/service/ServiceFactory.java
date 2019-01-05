package lk.ijse.dinemore.service;

import java.rmi.Remote;

public interface ServiceFactory extends Remote {

    public static enum ServiceTypes {

        CUSTOMER,CHEF,RECEPTION,DILIVERER,FOOODITEM;

    }

    SuperService getService(ServiceTypes varl) throws Exception;

}
