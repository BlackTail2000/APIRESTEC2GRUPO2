package pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmedico;
    private String nommedico;
    private String apemedico;
    @Temporal(TemporalType.DATE)
    private Date fechnacmedico;
}
