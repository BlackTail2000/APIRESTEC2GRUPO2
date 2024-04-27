package pe.edu.cibertec.APIRESTEC2GRUPO2.model.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Medico;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.repository.MedicoRepository;

@AllArgsConstructor
@Service
public class MedicoService implements IMedicoService {

    private MedicoRepository medicoRepository;

    @Override
    public Medico registrarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

}