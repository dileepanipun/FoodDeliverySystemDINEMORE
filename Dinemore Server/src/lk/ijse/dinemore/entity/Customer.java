package lk.ijse.dinemore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Customer")
public class Customer {

    @Id
    private String telephone;
    private String name;
    private String address;
    private String nic;

    public Customer() {
    }

    public Customer(String telephone, String name, String address, String nic) {
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
}
