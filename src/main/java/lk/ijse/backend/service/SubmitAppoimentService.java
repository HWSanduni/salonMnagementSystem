package lk.ijse.backend.service;

import lk.ijse.backend.dto.SubmitAppoimentDTO;

import java.util.List;

public interface SubmitAppoimentService {

    void submitAppoiment (SubmitAppoimentDTO submitAppoimentDTO);

    SubmitAppoimentDTO findeSubmit (Integer id);

    List<SubmitAppoimentDTO> getallSubmit();
}
