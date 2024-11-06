package com.wondertech.ejerdoscrud.controller;

import com.wondertech.ejerdoscrud.model.Duenio;
import com.wondertech.ejerdoscrud.service.DuenioService;
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
public class DuenioController {
    
    @Autowired
    DuenioService duenioService;
    
    //traer duenios
    @GetMapping("/duenios/traer")
    public List<Duenio> getDuenios(){
        return duenioService.getDuenios();
    }
    
    //traer un solo duenio
    @GetMapping("/duenio/traer/{id_duenio}")
    public Duenio findDuenio(@PathVariable Long id_duenio){
        Duenio duenio=duenioService.findDuenio(id_duenio);
        return duenio;
    }
    
    //Crear duenio
    @PostMapping("/duenio/crear")
    public String saveDuenio(@RequestBody Duenio duenio){
        duenioService.saveDuenio(duenio);
        return "Duenio creado exitosamente";
    }
    
    //Modificar Duenio
    @PutMapping("/duenio/editar")
    public String editDuenio(@RequestBody Duenio duenio){
        duenioService.editDuenio(duenio);
        return "Duenio modificado";
    }
    
    //Eliminar Duenio
    @DeleteMapping("/duenio/borrar/{id_duenio}")
    public String deleteDuenio(@PathVariable Long id_duenio){
        duenioService.deleteDuenio(id_duenio);
        return "Duenio eliminado correctamente";
    }
    
}
