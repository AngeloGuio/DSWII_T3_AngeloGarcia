package pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.dto;

import lombok.Data;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Autor;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd.Publicacion;

import java.util.Date;

@Data
public class PubsDto implements DtoEntity{
    private String titulo;
    private String resumen;
    private Date fechpublicacion;
    private AutorDto autor;

}
