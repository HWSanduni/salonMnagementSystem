package lk.ijse.backend.service;

import lk.ijse.backend.dto.SaloonServiceDTO;

import java.util.List;

public interface SaloonServiceService {

    void addService (SaloonServiceDTO dto);

    void updateService (SaloonServiceDTO dto);

    void deleteService (Integer id);

    SaloonServiceDTO findService (Integer id);

    List<SaloonServiceDTO> getAllService ();
}
