package pe.edu.cibertec.APIRESTEC2GRUPO2.model.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Especialidad;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.repository.EspecialidadRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class EspecialidadService implements IEspecialidadService {
    private EspecialidadRepository especialidadRepository;

    @Override
    public Especialidad registrarEspecialidad(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @Override
    public List<Especialidad> listarEspecialidades() {
        return especialidadRepository.findAll();
    }
}
