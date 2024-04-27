package pe.edu.cibertec.APIRESTEC2GRUPO2.controller.backoffice;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Medico;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.dto.MedicoRequestDto;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.service.IMedicoService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/medico")
public class MedicoController {

    private IMedicoService iMedicoService;

    @PostMapping("")
    public ResponseEntity<Medico> registrarMedico(
            @RequestBody MedicoRequestDto medicoRequestDto
            ){
        return new ResponseEntity<>(
            iMedicoService.registrarMedico(medicoRequestDto),
                HttpStatus.CREATED
        );
    }

    @GetMapping("")
    public List<Medico> listarMedicos(){
        return iMedicoService.listarMedicos();
    }
}
