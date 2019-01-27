package lk.ijse.backend.dto;



public class AppoimentDTO {

    private int aId;
    private String date;
    private String time;
    private CustomerDTO customer;
    private SaloonServiceDTO serviceDTO;

    public AppoimentDTO() {
    }

    public AppoimentDTO(int aId, String date, String time, CustomerDTO customer, SaloonServiceDTO serviceDTO) {
        this.aId = aId;
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.serviceDTO = serviceDTO;
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

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public SaloonServiceDTO getServiceDTO() {
        return serviceDTO;
    }

    public void setServiceDTO(SaloonServiceDTO serviceDTO) {
        this.serviceDTO = serviceDTO;
    }

    @Override
    public String toString() {
        return "AppoimentDTO{" +
                "aId=" + aId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", customer=" + customer +
                ", serviceDTO=" + serviceDTO +
                '}';
    }
}
