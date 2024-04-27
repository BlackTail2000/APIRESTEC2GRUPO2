package pe.edu.cibertec.APIRESTEC2GRUPO2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.APIRESTEC2GRUPO2.model.bd.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
}
