package lk.ijse.backend.controller;

import lk.ijse.backend.dto.SaloonServiceDTO;
import lk.ijse.backend.service.SaloonServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/service")
public class SaloonServiceController {

    @Autowired
    private SaloonServiceService saloonServiceService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addService(@RequestBody SaloonServiceDTO dto) {
        saloonServiceService.addService(dto);

    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateService(SaloonServiceDTO dto) {
        saloonServiceService.updateService(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable("id") Integer id) {
        saloonServiceService.deleteService(id);
    }

    @GetMapping(value = "/{id}"  , produces = MediaType.APPLICATION_JSON_VALUE)
    public SaloonServiceDTO findService(@PathVariable("id") Integer id) {
        return saloonServiceService.findService(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SaloonServiceDTO> getAllService() {
        return  saloonServiceService.getAllService();

    }
}
