package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.SaloonServiceDTO;
import lk.ijse.backend.entity.SaloonService;
import lk.ijse.backend.repositroy.SaloonServiceRepositry;
import lk.ijse.backend.service.SaloonServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class SaloonServiceImpl implements SaloonServiceService {

    @Autowired
    private SaloonServiceRepositry saloonServiceRepositry;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addService(SaloonServiceDTO dto) {
        saloonServiceRepositry.save(new SaloonService(dto.getServiceName(),dto.getTime(),dto.getPrice()));
    }

    @Override
    public void updateService(SaloonServiceDTO dto) {

        saloonServiceRepositry.save(new SaloonService(dto.getsId(),dto.getServiceName(),dto.getTime(),dto.getPrice()));
    }

    @Override
    public void deleteService(Integer id) {
        saloonServiceRepositry.deleteById(id);

    }

    @Override
    public SaloonServiceDTO findService(Integer id) {
        SaloonService saloonService = saloonServiceRepositry.findById(id).get();
        SaloonServiceDTO saloonServiceDTO = new SaloonServiceDTO(
                saloonService.getsId(),
                saloonService.getServiceName(),
                saloonService.getTime(),
                saloonService.getPrice()
        );
        return saloonServiceDTO;
    }

    @Override
    public List<SaloonServiceDTO> getAllService() {
       List<SaloonService> allService = saloonServiceRepositry.findAll();
       List<SaloonServiceDTO> serviceList = new ArrayList<>();
        for (SaloonService saloonService:allService
             ) {
            SaloonServiceDTO saloonServiceDTO = new SaloonServiceDTO(
                    saloonService.getsId(),
                    saloonService.getServiceName(),
                    saloonService.getTime(),
                    saloonService.getPrice()
            );
            serviceList.add(saloonServiceDTO);
        }
        return serviceList;
    }
}
