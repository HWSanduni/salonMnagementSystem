package lk.ijse.backend.repositroy;

import lk.ijse.backend.entity.Appoiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoimentReposity extends JpaRepository<Appoiment,Integer> {
}
