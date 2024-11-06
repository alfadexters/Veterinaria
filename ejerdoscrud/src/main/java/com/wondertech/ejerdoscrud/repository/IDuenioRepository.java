package com.wondertech.ejerdoscrud.repository;

import com.wondertech.ejerdoscrud.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository <Duenio,Long>{
    
}
