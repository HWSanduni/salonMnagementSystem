package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.AppoimentDTO;
import lk.ijse.backend.dto.CustomerDTO;
import lk.ijse.backend.dto.SubmitAppoimentDTO;
import lk.ijse.backend.entity.Appoiment;
import lk.ijse.backend.entity.Customer;
import lk.ijse.backend.entity.SaloonService;
import lk.ijse.backend.entity.SubmiAppoiment;
import lk.ijse.backend.repositroy.SubmitAppoimentRepositry;
import lk.ijse.backend.service.SubmitAppoimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class SubmitAppoimentServiceImpl implements SubmitAppoimentService {

    @Autowired
    private SubmitAppoimentRepositry submitAppoimentRepositry;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void submitAppoiment(SubmitAppoimentDTO submitAppoimentDTO) {

        Appoiment appoiment = new Appoiment();
        appoiment.getaId();
        appoiment.getTime();
        appoiment.getDate();
        appoiment.getCustomer();
        appoiment.getSaloonService();


        SubmiAppoiment submiAppoiment = new SubmiAppoiment();
        submiAppoiment.setSub_Id(submitAppoimentDTO.getSub_Id());
        submiAppoiment.setDate(submitAppoimentDTO.getDate());
        submiAppoiment.setResult(submitAppoimentDTO.getResult());
        submiAppoiment.setAppoiment(appoiment);

        submitAppoimentRepositry.save(submiAppoiment);

    }

    @Override
    public SubmitAppoimentDTO findeSubmit(Integer id) {
        SubmiAppoiment submiAppoiment = submitAppoimentRepositry.findById(id).get();

        SubmitAppoimentDTO submitAppoimentDTO = new SubmitAppoimentDTO();
        submitAppoimentDTO.getSub_Id();
        submitAppoimentDTO.getDate();
        submiAppoiment.getResult();
        submiAppoiment.getAppoiment();

        return submitAppoimentDTO;


    }


    @Override
    public List<SubmitAppoimentDTO> getallSubmit() {
       List<SubmiAppoiment> allDetails = submitAppoimentRepositry.findAll();

       List<SubmitAppoimentDTO> detailsList = new ArrayList<>();

        for (SubmiAppoiment submiAppoiment:allDetails
             ) {
            SubmitAppoimentDTO submitAppoimentDTO = new SubmitAppoimentDTO();
            submitAppoimentDTO.getSub_Id();
            submitAppoimentDTO.getDate();
            submitAppoimentDTO.getResult();
            submitAppoimentDTO.getAppoiment();


            detailsList.add(submitAppoimentDTO);
        }
        return detailsList;
    }
}
