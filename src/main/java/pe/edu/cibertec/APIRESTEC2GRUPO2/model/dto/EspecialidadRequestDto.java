package pe.edu.cibertec.APIRESTEC2GRUPO2.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class EspecialidadRequestDto {

    private String titulo;
    private String funcion;
    private Date fechgraduacion;
    private List<MedicoRequestDto> medico = new ArrayList<>();
}
