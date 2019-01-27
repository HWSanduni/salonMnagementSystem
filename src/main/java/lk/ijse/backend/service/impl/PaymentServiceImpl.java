package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.PaymentDTO;
import lk.ijse.backend.entity.*;
import lk.ijse.backend.repositroy.PaymentRepositry;
import lk.ijse.backend.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepositry paymentRepositry;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void makePayement(PaymentDTO paymentDTO) {

        Customer customer = new Customer();
        customer.getcId();
        customer.getFirstName();
        customer.getLastName();
        customer.getAddress();
        customer.getTel();
        customer.getEmail();
        customer.getUsename();
        customer.getPassword();

        SaloonService saloonService = new SaloonService();
        saloonService.getsId();
        saloonService.getServiceName();
        saloonService.getTime();
        saloonService.getPrice();

        Appoiment appoiment = new Appoiment();
        appoiment.getaId();
        appoiment.getDate();
        appoiment.getTime();
        appoiment.getCustomer();
        appoiment.getSaloonService();


        SubmiAppoiment submiAppoiment = new SubmiAppoiment();
        submiAppoiment.getSub_Id();
        submiAppoiment.getDate();
        submiAppoiment.getResult();
        submiAppoiment.getAppoiment();

        Payment payment = new Payment();
        payment.setpId(paymentDTO.getpId());
        payment.setDate(paymentDTO.getDate());
        payment.setPrice(paymentDTO.getPrice());
        payment.setCustomer(customer);
        payment.setService(saloonService);
        payment.setAppoiment(appoiment);
        payment.setSubmitAppoiment(submiAppoiment);

        paymentRepositry.save(payment);


    }

    @Override
    public PaymentDTO findePayment(Integer id) {
        return null;
    }

    @Override
    public List<PaymentDTO> getAllPayement() {
       List<Payment> allPayment = paymentRepositry.findAll();
       List<PaymentDTO> paymentList = new ArrayList<>();



       allPayment.forEach(p->paymentList.add(new Payment(p.getpId(),p.getDate(),p.getPrice(),p.getStatus(),p.getAppoiment(),p.getSubmitAppoiment(),p.getService(),p.getCustomer())));
      return paymentList;
    }

}
