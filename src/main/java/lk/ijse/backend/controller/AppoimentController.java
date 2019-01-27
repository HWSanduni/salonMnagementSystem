package lk.ijse.backend.controller;

import lk.ijse.backend.dto.AppoimentDTO;
import lk.ijse.backend.service.AppoimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/appoiment")
public class AppoimentController {

    @Autowired
    private AppoimentService appoimentService;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void createAppoiment(@RequestBody AppoimentDTO dto) {
        appoimentService.createAppoiment(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AppoimentDTO> getAllAppoiment(){
       return appoimentService.getAllAppoiment();
    }
}
