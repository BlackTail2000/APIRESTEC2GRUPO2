package pe.edu.cibertec.APIRESTEC2GRUPO2.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Especialidad;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.service.IEspecialidadService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/especialidad")
public class EspecialidadController {
    private IEspecialidadService iEspecialidadService;

    @GetMapping("")
    public List<Especialidad> listarEspecialidades(){
        return iEspecialidadService.listarEspecialidades();
    }
}
