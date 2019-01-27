package lk.ijse.backend.dto;

public class SubmitAppoimentDTO {

    private int sub_Id;
    private String date;
    private String result;
    private AppoimentDTO appoiment;

    public SubmitAppoimentDTO() {
    }

    public SubmitAppoimentDTO(int sub_Id, String date, String result, AppoimentDTO appoiment) {
        this.sub_Id = sub_Id;
        this.date = date;
        this.result = result;
        this.appoiment = appoiment;
    }

    public SubmitAppoimentDTO(String date, String result, AppoimentDTO appoiment) {
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

    public AppoimentDTO getAppoiment() {
        return appoiment;
    }

    public void setAppoiment(AppoimentDTO appoiment) {
        this.appoiment = appoiment;
    }

    @Override
    public String toString() {
        return "SubmitAppoimentDTO{" +
                "sub_Id=" + sub_Id +
                ", date='" + date + '\'' +
                ", result='" + result + '\'' +
                ", appoiment=" + appoiment +
                '}';
    }
}
