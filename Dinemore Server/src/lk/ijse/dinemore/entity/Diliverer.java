package lk.ijse.dinemore.entity;

public class Diliverer {

    private int devID;
    private String dlevereName;
    private String address;
    private String telephone;

    public Diliverer(int devID, String dlevereName, String address, String telephone) {
        this.devID = devID;
        this.dlevereName = dlevereName;
        this.address = address;
        this.telephone = telephone;
    }

    public int getDevID() {
        return devID;
    }

    public void setDevID(int devID) {
        this.devID = devID;
    }

    public String getDlevereName() {
        return dlevereName;
    }

    public void setDlevereName(String dlevereName) {
        this.dlevereName = dlevereName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
