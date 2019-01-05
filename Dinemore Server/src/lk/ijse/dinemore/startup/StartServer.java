package lk.ijse.dinemore.startup;

import lk.ijse.dinemore.service.impl.ServiceFactoryImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StartServer {

    public static void main(String[] args) {


        try {

            Registry registry = LocateRegistry.createRegistry(6060);
            registry.rebind("Dinemore", ServiceFactoryImpl.getInstance());
            System.out.println("Server Has been Started Successfully");

//            new Alert(Alert.AlertType.INFORMATION,"Server Has Been Started",null).show();

        }catch (RemoteException e){
            e.printStackTrace();
        }
    }
}
