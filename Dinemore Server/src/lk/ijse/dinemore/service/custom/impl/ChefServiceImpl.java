package lk.ijse.dinemore.service.custom.impl;

import lk.ijse.dinemore.business.BOFactory;
import lk.ijse.dinemore.business.custom.ChefBO;
import lk.ijse.dinemore.model.ChefDTO;
import lk.ijse.dinemore.observe.Observer;
import lk.ijse.dinemore.observe.Subject;
import lk.ijse.dinemore.service.custom.ChefService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ChefServiceImpl extends UnicastRemoteObject implements ChefService, Subject {

    private ChefBO chefBO;

    private static ArrayList<Observer> allObservers = new ArrayList<>();

    public ChefServiceImpl() throws RemoteException {

        chefBO = (ChefBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CHEF);

    }

    @Override
    public void registerObserver(Observer var1) throws Exception {

    }

    @Override
    public void unregisterObserver(Observer var1) throws Exception {

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
    public boolean addChef(ChefDTO chefDTO) throws Exception {

        boolean result = chefBO.addChef(chefDTO);

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
