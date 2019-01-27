package lk.ijse.backend.repositroy;

import lk.ijse.backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositroy extends JpaRepository<Customer , Integer> {
}
