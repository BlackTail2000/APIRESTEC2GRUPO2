package pe.edu.cibertec.APIRESTEC2GRUPO2.controller.backoffice;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Medico;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.dto.MedicoRequestDto;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.service.IMedicoService;

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
}
