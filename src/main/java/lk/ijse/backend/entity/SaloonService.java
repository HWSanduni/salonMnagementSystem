package lk.ijse.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaloonService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sId;
    private String serviceName;
    private String time;
    private double price;

    public SaloonService() {
    }

    public SaloonService(int sId,String serviceName, String time, double price) {
        this.sId = sId;
        this.serviceName = serviceName;
        this.time = time;
        this.price = price;
    }
    public SaloonService(String serviceName, String time, double price) {
        this.serviceName = serviceName;
        this.time = time;
        this.price = price;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SaloonService{" +
                "sId=" + sId +
                ", serviceName='" + serviceName + '\'' +
                ", time='" + time + '\'' +
                ", price=" + price +
                '}';
    }
}
