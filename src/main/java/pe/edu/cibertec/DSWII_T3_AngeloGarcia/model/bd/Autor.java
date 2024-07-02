package pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.bd;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idautor;
    private String nomautor;
    private String apeautor;
    private Date fechnacautor;

}
