package lk.ijse.backend.service;

import lk.ijse.backend.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {

    void makePayement (PaymentDTO paymentDTO);

    PaymentDTO findePayment (Integer id);

    List<PaymentDTO> getAllPayement();
}
