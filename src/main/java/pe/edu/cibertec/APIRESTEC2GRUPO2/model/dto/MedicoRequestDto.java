package pe.edu.cibertec.APIRESTEC2GRUPO2.model.dto;

import lombok.Data;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Especialidad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class MedicoRequestDto {

    private String nommedico;
    private String apemedico;
    private Date fechnacmedico;
    private List<EspecialidadRequestDto> especialidad = new ArrayList<>();
}
