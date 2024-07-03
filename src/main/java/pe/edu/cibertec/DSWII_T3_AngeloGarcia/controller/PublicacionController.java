package pe.edu.cibertec.DSWII_T3_AngeloGarcia.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.dto.DtoEntity;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.model.dto.PubsDto;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.service.IPublicacionService;
import pe.edu.cibertec.DSWII_T3_AngeloGarcia.util.DtoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@RestController
@RequestMapping("api/v1/pubsdto")
public class PublicacionController {

    private IPublicacionService iPublicacionService;

    @GetMapping("/dto")
    @PreAuthorize("hasRole('Coordinador')")
    public ResponseEntity<List<DtoEntity>> listarPublicacionDto(){
        List<DtoEntity> publicaciontDtoList = new ArrayList<>();
        publicaciontDtoList = iPublicacionService.listarPublicacion()
                .stream()
                .map(x -> new DtoUtil().convertirADto(x, new PubsDto()))
                .collect(Collectors.toList());
        if(publicaciontDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(publicaciontDtoList, HttpStatus.OK);
    }

}
