package pe.edu.cibertec.APIRESTEC2GRUPO2.model.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Especialidad;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Medico;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.dto.EspecialidadRequestDto;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.dto.MedicoRequestDto;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.repository.MedicoRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class MedicoService implements IMedicoService {

    private MedicoRepository medicoRepository;
    private IEspecialidadService iEspecialidadService;

    @Transactional
    @Override
    public Medico registrarMedico(MedicoRequestDto medicoRequestDto) {
        Medico medico = new Medico();
        medico.setNommedico(medicoRequestDto.getNommedico());
        medico.setApemedico(medicoRequestDto.getApemedico());
        medico.setFechnacmedico(medicoRequestDto.getFechnacmedico());
        Medico nuevoMedico = medicoRepository.save(medico);
        Especialidad especialidad;
        for(EspecialidadRequestDto especialidadRequestDto : medicoRequestDto.getEspecialidad()){
            especialidad = new Especialidad();
            especialidad.setTitulo(especialidadRequestDto.getTitulo());
            especialidad.setFuncion(especialidadRequestDto.getFuncion());
            especialidad.setFechgraduacion(especialidadRequestDto.getFechgraduacion());
            especialidad.setMedico(nuevoMedico);
            iEspecialidadService.registrarEspecialidad(especialidad);
        }
        return nuevoMedico;
    }

    @Override
    public List<Medico> listarMedicos() {
        return medicoRepository.findAll();
    }
}