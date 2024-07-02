package pe.edu.cibertec.DSWII_T3_AngeloGarcia.repository;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Usuario;

@Repository
public interface UsuarioRepository {
    //SELECT * FROM USUARIO WHERE NOMUSUARIO = 'ANGELO'
    Usuario findByNomusuario(String nomusuario);

    //SELECT * FROM USUARIO WHERE NOMBRES = 'ANGELO'
    Usuario findByNombres(String nombres);
}
