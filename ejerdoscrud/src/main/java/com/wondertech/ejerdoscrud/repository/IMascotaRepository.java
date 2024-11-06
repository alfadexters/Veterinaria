package com.wondertech.ejerdoscrud.repository;

import com.wondertech.ejerdoscrud.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMascotaRepository extends JpaRepository <Mascota,Long>{
    
}
