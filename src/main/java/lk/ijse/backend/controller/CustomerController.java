package lk.ijse.backend.controller;

import lk.ijse.backend.dto.CustomerDTO;
import lk.ijse.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveCustomer(@RequestBody CustomerDTO dto){
        customerService.saveCustomer(dto);

        System.out.println("123");

        System.out.println("Sanduni");


    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Integer id) {
        customerService.deleteCustomer(id);
    }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateCustomer(@PathVariable("id") CustomerDTO dto) {

        customerService.updateCustomer(dto);
    }

    @GetMapping(value = "/{id}"  , produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO searchCustomer(@PathVariable ("id")Integer id) {

       return customerService.searchCustomer(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getAllCustomer() {
        return customerService.getAllCustomer();
    }

}
