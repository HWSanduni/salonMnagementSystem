package lk.ijse.backend.service;

import lk.ijse.backend.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    void saveCustomer (CustomerDTO dto);

    void deleteCustomer(Integer id);

    void updateCustomer (CustomerDTO dto);

    CustomerDTO searchCustomer (Integer id);

    List<CustomerDTO> getAllCustomer ();



}
