package lk.ijse.backend.repositroy;

import lk.ijse.backend.dto.SaloonServiceDTO;
import lk.ijse.backend.entity.SaloonService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaloonServiceRepositry extends JpaRepository<SaloonService,Integer> {

}
