package pe.edu.cibertec.APIRESTEC2GRUPO2.model.service;

import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Especialidad;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.dto.EspecialidadRequestDto;

import java.util.List;

public interface IEspecialidadService {
    Especialidad registrarEspecialidad(Especialidad especialidad);
    List<Especialidad> listarEspecialidades();
}
