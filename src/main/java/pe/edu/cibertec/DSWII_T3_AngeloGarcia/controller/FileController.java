package pe.edu.cibertec.DSWII_T3_AngeloGarcia.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/files")
public class FileController {

    @PostMapping("/filesimages")
    @PreAuthorize("hasRole('Gestor')")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        if (!file.getOriginalFilename().endsWith(".png")) {
            return ResponseEntity.badRequest().body("Only PNG files are allowed.");
        }

        try {
            Path filePath = Paths.get("Images", file.getOriginalFilename());
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
            return ResponseEntity.ok("File uploaded successfully.");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File upload failed.");
        }
    }

}
