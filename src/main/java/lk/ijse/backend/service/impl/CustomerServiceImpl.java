package lk.ijse.backend.service.impl;

import lk.ijse.backend.dto.CustomerDTO;
import lk.ijse.backend.entity.Customer;
import lk.ijse.backend.repositroy.CustomerRepositroy;
import lk.ijse.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class CustomerServiceImpl  implements CustomerService {

    @Autowired
    private CustomerRepositroy customerRepositroy;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveCustomer(CustomerDTO dto) {

        customerRepositroy.save(new Customer(dto.getcId(),dto.getFirstName(),dto.getLastName(),
                dto.getAddress(),dto.getTel(),dto.getEmail(),dto.getUsename(),dto.getPassword()));


    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepositroy.deleteById(id);
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {


        customerRepositroy.save(new Customer(dto.getFirstName(),dto.getLastName(),
                dto.getAddress(),dto.getTel(),dto.getEmail(),dto.getUsename(),dto.getPassword()));


    }

    @Override
    public CustomerDTO searchCustomer(Integer id) {

        Customer customer = customerRepositroy.findById(id).get();
        CustomerDTO customerDTO = new CustomerDTO(customer.getcId(),customer.getFirstName(),customer.getLastName(),
                customer.getAddress(),customer.getTel(),customer.getEmail(),customer.getUsename(),customer.getPassword());
        return customerDTO;

    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer> allCustomer = customerRepositroy.findAll();
        List<CustomerDTO> customerList = new ArrayList<>();

        for ( Customer customer: allCustomer
             ) {
            CustomerDTO customerDTO = new CustomerDTO(
                    customer.getcId(),
                    customer.getFirstName(),
                    customer.getLastName(),
                    customer.getAddress(),
                    customer.getTel(),
                    customer.getEmail(),
                    customer.getUsename(),
                    customer.getPassword());
            customerList.add(customerDTO);

        }
        return customerList;

    }
}
