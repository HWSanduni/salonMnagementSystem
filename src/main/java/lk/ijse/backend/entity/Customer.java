package lk.ijse.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;
    private String firstName;
    private String lastName;
    private String address;
    private String tel;
    private String email;
    private String usename;
    private String password;

    public Customer() {
    }

    public Customer(int cId,String firstName, String lastName, String address, String tel, String email, String usename, String password) {
        this.cId=cId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.usename = usename;
        this.password = password;
    }

    public Customer(String firstName, String lastName, String address, String tel, String email, String usename, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.usename = usename;
        this.password = password;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cId=" + cId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", usename='" + usename + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
