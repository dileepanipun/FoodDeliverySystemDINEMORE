package lk.ijse.dinemore.observe;

public interface Subject extends Observer {

    void registerObserver(Observer var1) throws Exception;

    void unregisterObserver(Observer var1) throws Exception;

    void notifyObservers() throws Exception;

}
