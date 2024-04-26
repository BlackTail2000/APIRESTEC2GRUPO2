package pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idespecialidad;
    private String titulo;
    private String funcion;
    @Temporal(TemporalType.DATE)
    private Date fechgraduacion;
    @ManyToOne
    @JoinColumn(name = "idmedico")
    private Medico medico;
}
