package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.AppoimentDTO;
import lk.ijse.backend.dto.CustomerDTO;
import lk.ijse.backend.dto.SaloonServiceDTO;
import lk.ijse.backend.entity.Appoiment;
import lk.ijse.backend.entity.Customer;
import lk.ijse.backend.entity.SaloonService;
import lk.ijse.backend.repositroy.AppoimentReposity;
import lk.ijse.backend.service.AppoimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class AppoimentServiceImpl implements AppoimentService {

    @Autowired
    private AppoimentReposity appoimentReposity;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void createAppoiment(AppoimentDTO dto) {

        Customer customer = new Customer();
        customer.getcId();
        customer.getFirstName();
        customer.getLastName();
        customer.getTel();
        customer.getAddress();
        customer.getEmail();
        customer.getUsename();
        customer.getPassword();

        SaloonService saloonService = new SaloonService();
        saloonService.getsId();
        saloonService.getServiceName();
        saloonService.getTime();
        saloonService.getPrice();


        Appoiment appoiment = new Appoiment();
        appoiment.setDate(dto.getDate());
        appoiment.setTime(dto.getTime());
        appoiment.setCustomer(customer);
        appoiment.setSaloonService(saloonService);

        appoimentReposity.save(appoiment);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateAppoiment(AppoimentDTO dto) {
        Customer customer = new Customer();
        customer.getcId();
        customer.getFirstName();
        customer.getLastName();
        customer.getTel();
        customer.getAddress();
        customer.getEmail();
        customer.getUsename();
        customer.getPassword();

        SaloonService saloonService = new SaloonService();
        saloonService.getsId();
        saloonService.getServiceName();
        saloonService.getTime();
        saloonService.getPrice();


        Appoiment appoiment = new Appoiment();
        appoiment.setaId(dto.getaId());
        appoiment.setDate(dto.getDate());
        appoiment.setTime(dto.getTime());
        appoiment.setCustomer(customer);
        appoiment.setSaloonService(saloonService);

        appoimentReposity.save(appoiment);

    }

    @Override
    public void deleteAppoiment(Integer id) {
        appoimentReposity.deleteById(id);
    }

    @Override
    public AppoimentDTO findeAppoiment(Integer id) {
        Appoiment appoiment = appoimentReposity.findById(id).get();
        AppoimentDTO appoimentDTO = new AppoimentDTO();
        appoimentDTO.setaId(appoiment.getaId());
        appoimentDTO.setDate(appoiment.getDate());
        appoimentDTO.setTime(appoiment.getTime());
        CustomerDTO customerDTO = new CustomerDTO(
                appoiment.getCustomer().getcId(),
                appoiment.getCustomer().getFirstName(),
                appoiment.getCustomer().getLastName(),
                appoiment.getCustomer().getAddress(),
                appoiment.getCustomer().getTel(),
                appoiment.getCustomer().getEmail(),
                appoiment.getCustomer().getUsename(),
                appoiment.getCustomer().getPassword()
        );
        SaloonServiceDTO saloonServiceDTO = new SaloonServiceDTO(
                appoiment.getSaloonService().getsId(),
                appoiment.getSaloonService().getServiceName(),
                appoiment.getSaloonService().getTime(),
                appoiment.getSaloonService().getPrice()
        );
        appoimentDTO.setCustomer(customerDTO);
        appoimentDTO.setServiceDTO(saloonServiceDTO);

        return appoimentDTO;
    }

    @Override
    public List<AppoimentDTO> getAllAppoiment(){
        List<Appoiment> allAppoiment = appoimentReposity.findAll();
        List<AppoimentDTO> appoimentList = new ArrayList<>();
        for (Appoiment appoiment: allAppoiment
             ) {
            AppoimentDTO appoimentDTO = new AppoimentDTO();
            appoimentDTO.setaId(appoiment.getaId());
            appoimentDTO.setDate(appoiment.getDate());
            appoimentDTO.setTime(appoiment.getTime());
            CustomerDTO customerDTO = new CustomerDTO(
                    appoiment.getCustomer().getcId(),
                    appoiment.getCustomer().getFirstName(),
                    appoiment.getCustomer().getLastName(),
                    appoiment.getCustomer().getAddress(),
                    appoiment.getCustomer().getTel(),
                    appoiment.getCustomer().getEmail(),
                    appoiment.getCustomer().getUsename(),
                    appoiment.getCustomer().getPassword());

            SaloonServiceDTO saloonServiceDTO = new SaloonServiceDTO(
            appoiment.getSaloonService().getsId(),
                    appoiment.getSaloonService().getServiceName(),
                    appoiment.getSaloonService().getTime(),
                    appoiment.getSaloonService().getPrice());


            appoimentDTO.setCustomer(customerDTO);
            appoimentDTO.setServiceDTO(saloonServiceDTO);
            appoimentList.add(appoimentDTO);

        }

     return appoimentList;
    }
}
