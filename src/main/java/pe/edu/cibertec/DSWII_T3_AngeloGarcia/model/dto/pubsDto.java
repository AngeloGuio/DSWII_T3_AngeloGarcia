package pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.dto;

import lombok.Data;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Autor;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Publicacion;

import java.util.Date;

@Data
public class pubsDto implements DtoEntity{
    private Publicacion titulo;
    private Publicacion resumen;
    private Publicacion fechpublicacion;
    private Autor nomautor;
    private Autor apeautor;
}
