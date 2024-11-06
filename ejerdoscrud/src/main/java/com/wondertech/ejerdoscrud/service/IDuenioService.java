package com.wondertech.ejerdoscrud.service;

import com.wondertech.ejerdoscrud.model.Duenio;
import java.util.List;

public interface IDuenioService {
    public List<Duenio> getDuenios();
    public void saveDuenio(Duenio duenio);
    public Duenio findDuenio(Long id_duenio); 
    public void deleteDuenio(Long id_duenio);
    public void editDuenio(Duenio duenio);
}
