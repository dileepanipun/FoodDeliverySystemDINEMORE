package lk.ijse.dinemore.reservation;

import java.rmi.Remote;

public interface Reservation extends Remote {

    public boolean reserve(Object varl) throws Exception;

    public boolean release(Object varl) throws Exception;

}
