package lk.ijse.backend.entity;

import javax.persistence.*;

@Entity
public class Appoiment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aId;
    private String date;
    private String time;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    private SaloonService saloonService;

    public Appoiment() {
    }

    public Appoiment(int aId, String date, String time, Customer customer, SaloonService saloonService) {
        this.aId = aId;
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.saloonService = saloonService;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public SaloonService getSaloonService() {
        return saloonService;
    }

    public void setSaloonService(SaloonService saloonService) {
        this.saloonService = saloonService;
    }

    @Override
    public String toString() {
        return "Appoiment{" +
                "aId=" + aId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", customer=" + customer +
                ", saloonService=" + saloonService +
                '}';
    }
}
