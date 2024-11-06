package com.wondertech.ejerdoscrud.service;

import com.wondertech.ejerdoscrud.dto.MascotaDuenioDTO;
import com.wondertech.ejerdoscrud.model.Mascota;
import java.util.List;


public interface IMascotaService {
    
    public List<Mascota> getMascotas();
    public Mascota findMascota(Long id_mascota);
    public void saveMascota(Mascota mascota);
    public void deleteMascota(Long id_mascota);
    public void editMascota(Mascota mascota);
    public List<Mascota> getMascotasFiltro();
    public List<MascotaDuenioDTO> getMascotaDuenio();
}
