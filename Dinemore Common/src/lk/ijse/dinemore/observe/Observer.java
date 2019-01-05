package lk.ijse.dinemore.observe;

import java.rmi.Remote;

public interface Observer extends Remote {

    void updateObserver() throws Exception;

}
