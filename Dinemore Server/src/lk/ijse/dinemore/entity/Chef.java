package lk.ijse.dinemore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Chef")
public class Chef {

    @Id
    private String ChefID;
    private String ChefName;
    private String address;
    private Double salary;
    private String telephoneNo;

    public Chef() {
    }

    public Chef(String chefID, String chefName, String address, Double salary, String telephoneNo) {
        this.ChefID = chefID;
        this.ChefName = chefName;
        this.address = address;
        this.salary = salary;
        this.telephoneNo = telephoneNo;
    }

    public String getChefID() {
        return ChefID;
    }

    public void setChefID(String chefID) {
        ChefID = chefID;
    }

    public String getChefName() {
        return ChefName;
    }

    public void setChefName(String chefName) {
        ChefName = chefName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

}
