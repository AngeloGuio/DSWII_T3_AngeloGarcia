package pe.edu.cibertec.DSWII_T3_AngeloGarcia.service;

import lombok.AllArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Publicacion;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.repository.PublicacionRepository;

import java.security.PrivateKey;
import java.util.List;

@AllArgsConstructor
@Service
public class PublicacionService implements  IPublicacionService{

    private PublicacionRepository publicacionRepository;
    @Override
    public List<Publicacion> listarPublicacion() {
        return publicacionRepository.findAll();
    }
}
