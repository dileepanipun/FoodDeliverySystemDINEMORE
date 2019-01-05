package lk.ijse.dinemore.model;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

    private String telephone;
    private String name;
    private String address;
    private String nic;

    public CustomerDTO() {
    }

    public CustomerDTO(String telephone, String name, String address, String nic) {
        this.telephone = telephone;
        this.name = name;
        this.address = address;
        this.nic = nic;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "telephone='" + telephone + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
