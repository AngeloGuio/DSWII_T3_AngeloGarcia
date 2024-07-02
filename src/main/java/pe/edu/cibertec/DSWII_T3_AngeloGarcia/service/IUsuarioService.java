package pe.edu.cibertec.DSWII_T3_AngeloGarcia.service;

import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Usuario;

public interface IUsuarioService {
    Usuario obtenerUsuarioPorNomUsuario(String nomusuario);
}
