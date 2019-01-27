package lk.ijse.backend.dto;

public class PaymentDTO {

    private int pId;
    private String date;
    private double price;
    private String status;
    private AppoimentDTO appoimentDTO;
    private SubmitAppoimentDTO submitAppoimentDTO;
    private SaloonServiceDTO serviceDTO;
    private CustomerDTO customerDTO;

    public PaymentDTO() {
    }

    public PaymentDTO(int pId, String date, double price, String status, AppoimentDTO appoimentDTO, SubmitAppoimentDTO submitAppoimentDTO, SaloonServiceDTO serviceDTO, CustomerDTO customerDTO) {
        this.pId = pId;
        this.date = date;
        this.price = price;
        this.status = status;
        this.appoimentDTO = appoimentDTO;
        this.submitAppoimentDTO = submitAppoimentDTO;
        this.serviceDTO = serviceDTO;
        this.customerDTO = customerDTO;
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

    public AppoimentDTO getAppoimentDTO() {
        return appoimentDTO;
    }

    public void setAppoimentDTO(AppoimentDTO appoimentDTO) {
        this.appoimentDTO = appoimentDTO;
    }

    public SubmitAppoimentDTO getSubmitAppoimentDTO() {
        return submitAppoimentDTO;
    }

    public void setSubmitAppoimentDTO(SubmitAppoimentDTO submitAppoimentDTO) {
        this.submitAppoimentDTO = submitAppoimentDTO;
    }

    public SaloonServiceDTO getServiceDTO() {
        return serviceDTO;
    }

    public void setServiceDTO(SaloonServiceDTO serviceDTO) {
        this.serviceDTO = serviceDTO;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "pId=" + pId +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", appoimentDTO=" + appoimentDTO +
                ", submitAppoimentDTO=" + submitAppoimentDTO +
                ", serviceDTO=" + serviceDTO +
                ", customerDTO=" + customerDTO +
                '}';
    }
}
