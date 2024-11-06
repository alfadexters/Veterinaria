
package com.wondertech.ejerdoscrud.service;

import com.wondertech.ejerdoscrud.model.Duenio;
import com.wondertech.ejerdoscrud.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService{

    @Autowired
    IDuenioRepository duenioRepository;
    
    @Override
    public List<Duenio> getDuenios() {
        List<Duenio> listaDuenios = duenioRepository.findAll();
        return listaDuenios;
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepository.save(duenio);
    }

    @Override
    public Duenio findDuenio(Long id_duenio) {
        Duenio duenio=duenioRepository.findById(id_duenio).orElse(null);
        return duenio;
    }

    @Override
    public void deleteDuenio(Long id_duenio) {
        duenioRepository.deleteById(id_duenio);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.saveDuenio(duenio);
    }
    
}
