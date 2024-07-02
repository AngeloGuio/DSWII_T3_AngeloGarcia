package pe.edu.cibertec.DSWII_T3_AngeloGarcia.repository;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Rol;

@Repository
public interface RolRepository {
    //SELECT * FROM ROL WHERE NOMROL = 'ADMIN'
    Rol findByNomrol(String nomrol);
}
