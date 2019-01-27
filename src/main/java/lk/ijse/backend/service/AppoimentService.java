package lk.ijse.backend.service;

import lk.ijse.backend.dto.AppoimentDTO;

import java.util.List;

public interface AppoimentService  {

    void createAppoiment (AppoimentDTO dto);

    void updateAppoiment (AppoimentDTO dto);

    void deleteAppoiment (Integer id);

    AppoimentDTO findeAppoiment (Integer id);

    List<AppoimentDTO> getAllAppoiment ();
}
