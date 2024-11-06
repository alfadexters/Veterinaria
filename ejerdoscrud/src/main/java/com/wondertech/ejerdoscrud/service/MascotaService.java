package com.wondertech.ejerdoscrud.service;

import com.wondertech.ejerdoscrud.dto.MascotaDuenioDTO;
import com.wondertech.ejerdoscrud.model.Mascota;
import com.wondertech.ejerdoscrud.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {
    
    @Autowired
    IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas=mascotaRepository.findAll();
        return listaMascotas;
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        Mascota mascota=mascotaRepository.findById(id_mascota).orElse(null);
        return mascota;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascotaRepository.deleteById(id_mascota);
    }

    @Override
    public void editMascota(Mascota mascota) {
        this.saveMascota(mascota);
    }

    @Override
    public List<Mascota> getMascotasFiltro() {
        List<Mascota> listMascotas = mascotaRepository.findAll();
        List<Mascota> listMascotasFiltro = new ArrayList<>();

        for (Mascota mascota : listMascotas) {
            if (mascota.getEspecie().equalsIgnoreCase("perro") && mascota.getRaza().equalsIgnoreCase("caniche")) {
                listMascotasFiltro.add(mascota);
            }
        }

        return listMascotasFiltro;
    }

    @Override
    public List<MascotaDuenioDTO> getMascotaDuenio() {
        List<Mascota> listMascotas = mascotaRepository.findAll();
        List<MascotaDuenioDTO> listMasDue=new ArrayList<MascotaDuenioDTO>();
        MascotaDuenioDTO mascoDue=new MascotaDuenioDTO();
        for (Mascota mascota : listMascotas) {
            mascoDue.setNombre_mascota(mascota.getNombre());
            mascoDue.setEspecie(mascota.getEspecie());
            mascoDue.setRaza(mascota.getRaza());
            mascoDue.setNombre_duenio(mascota.getDuenio().getNombre());
            mascoDue.setApellido_duenio(mascota.getDuenio().getApellido());
            listMasDue.add(mascoDue);
            mascoDue=new MascotaDuenioDTO();//se reinicia la variable una vez guardado el duenio y mascota
        }
        return listMasDue;
    }

    
}
