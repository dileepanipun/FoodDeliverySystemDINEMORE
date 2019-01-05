package lk.ijse.dinemore.entity;

public class Reception {

    private String receptionID;
    private String name;
    private String address;
    private Double salary;
    private String telephone;

    public Reception(String recptionId, String name, String address, Double salary, String telephone) {
        this.receptionID = recptionId;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.telephone = telephone;
    }

    public String getRecptionId() {
        return receptionID;
    }

    public void setRecptionId(String recptionId) {
        this.receptionID = recptionId;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
