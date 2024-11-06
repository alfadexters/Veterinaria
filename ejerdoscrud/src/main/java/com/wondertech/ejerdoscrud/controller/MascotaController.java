package com.wondertech.ejerdoscrud.controller;

import com.wondertech.ejerdoscrud.dto.MascotaDuenioDTO;
import com.wondertech.ejerdoscrud.model.Mascota;
import com.wondertech.ejerdoscrud.service.MascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    @Autowired
    MascotaService mascotaService;
    
    @GetMapping("/mascota/traer")
    public List<Mascota> getMascotas(){
        return mascotaService.getMascotas();
    }
    
    @GetMapping("/mascota/traer/{id_mascota}")
    public Mascota findMascota(@PathVariable Long id_mascota){
        Mascota mascota=mascotaService.findMascota(id_mascota);
        return mascota;
    }
    
    @GetMapping("/mascota/traer-caniches")
    public List<Mascota> getMascotasFiltro(){
        return mascotaService.getMascotasFiltro();
    }
    
    @GetMapping("/mascota-duenio/traer")
    public List<MascotaDuenioDTO> getMasDue(){
        return mascotaService.getMascotaDuenio();
    }
    
    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);
        return "Mascota creada";
    }
    
    @PutMapping("/mascota/editar")
    public String editMascota(@RequestBody Mascota mascota){
        mascotaService.editMascota(mascota);
        return "Mascota modificada";
    }
    
    @DeleteMapping("/mascota/eliminar/{id_mascota}")
    public String deleteMascota(@PathVariable Long id_mascota){
        mascotaService.deleteMascota(id_mascota);
        return "Mascota eliminada";
    }
    
}
