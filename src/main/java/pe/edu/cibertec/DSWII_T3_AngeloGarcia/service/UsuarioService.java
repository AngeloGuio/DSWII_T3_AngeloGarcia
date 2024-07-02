package pe.edu.cibertec.DSWII_T3_AngeloGarcia.service;

import lombok.AllArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Usuario;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.repository.UsuarioRepository;

@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService{

    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario obtenerUsuarioPorNomUsuario(String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}
