package pe.edu.cibertec.APIRESTEC2GRUPO2.model.service;

import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Medico;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.dto.MedicoRequestDto;

import java.util.List;

public interface IMedicoService {

    Medico registrarMedico(MedicoRequestDto medicoRequestDto);
    List<Medico> listarMedicos();
}
