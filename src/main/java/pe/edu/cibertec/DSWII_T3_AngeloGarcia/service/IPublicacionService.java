package pe.edu.cibertec.DSWII_T3_AngeloGarcia.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Publicacion;

import java.util.List;


public interface IPublicacionService {

    List<Publicacion> listarPublicacion();

}
