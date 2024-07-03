package pe.edu.cibertec.DSWII_T3_AngeloGarcia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    //SELECT * FROM ROL WHERE NOMROL = 'ADMIN'
    Rol findByNomrol(String nomrol);
}
