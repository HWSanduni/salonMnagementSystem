package lk.ijse.backend.entity;

import lk.ijse.backend.dto.PaymentDTO;

import javax.persistence.*;

@Entity
public class Payment extends PaymentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pId;
    private String date;
    private double price;
    private String status;
    @OneToOne(cascade = CascadeType.ALL)
    private Appoiment appoiment;
    @OneToOne(cascade = CascadeType.ALL)
    private SubmiAppoiment submitAppoiment;
    @ManyToOne(cascade = CascadeType.ALL)
    private SaloonService service;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;


    public Payment() {
    }

    public Payment(int pId, String date, double price, String status, Appoiment appoiment, SubmiAppoiment submitAppoiment, SaloonService service, Customer customer) {
        this.pId = pId;
        this.date = date;
        this.price = price;
        this.status = status;
        this.appoiment = appoiment;
        this.submitAppoiment = submitAppoiment;
        this.service = service;
        this.customer = customer;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Appoiment getAppoiment() {
        return appoiment;
    }

    public void setAppoiment(Appoiment appoiment) {
        this.appoiment = appoiment;
    }

    public SubmiAppoiment getSubmitAppoiment() {
        return submitAppoiment;
    }

    public void setSubmitAppoiment(SubmiAppoiment submitAppoiment) {
        this.submitAppoiment = submitAppoiment;
    }

    public SaloonService getService() {
        return service;
    }

    public void setService(SaloonService service) {
        this.service = service;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "pId=" + pId +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", appoiment=" + appoiment +
                ", submitAppoiment=" + submitAppoiment +
                ", service=" + service +
                ", customer=" + customer +
                '}';
    }
}
