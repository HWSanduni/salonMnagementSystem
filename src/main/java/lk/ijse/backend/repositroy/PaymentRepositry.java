package lk.ijse.backend.repositroy;

import lk.ijse.backend.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepositry  extends JpaRepository<Payment,Integer> {


}
