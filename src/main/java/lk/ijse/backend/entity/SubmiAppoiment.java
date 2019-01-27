package lk.ijse.backend.entity;

import javax.persistence.*;

@Entity
public class SubmiAppoiment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sub_Id;
    private String date;
    private String result;

    @OneToOne(cascade = CascadeType.ALL)
    private Appoiment appoiment;

    public SubmiAppoiment() {
    }

    public SubmiAppoiment(int sub_Id, String date, String result, Appoiment appoiment) {
        this.sub_Id = sub_Id;
        this.date = date;
        this.result = result;
        this.appoiment = appoiment;
    }

    public SubmiAppoiment(String date, String result, Appoiment appoiment) {
        this.date = date;
        this.result = result;
        this.appoiment = appoiment;
    }

    public int getSub_Id() {
        return sub_Id;
    }

    public void setSub_Id(int sub_Id) {
        this.sub_Id = sub_Id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Appoiment getAppoiment() {
        return appoiment;
    }

    public void setAppoiment(Appoiment appoiment) {
        this.appoiment = appoiment;
    }

    @Override
    public String toString() {
        return "SubmiAppoiment{" +
                "sub_Id=" + sub_Id +
                ", date='" + date + '\'' +
                ", result='" + result + '\'' +
                ", appoiment=" + appoiment +
                '}';
    }
}
