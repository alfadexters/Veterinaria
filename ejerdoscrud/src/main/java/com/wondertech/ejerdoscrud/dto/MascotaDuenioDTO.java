package com.wondertech.ejerdoscrud.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascotaDuenioDTO {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_duenio;
    private String apellido_duenio;

    public MascotaDuenioDTO(String nombre_mascota, String especie, String raza, String nombre_duenio, String apellido_nombre) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_duenio = nombre_duenio;
        this.apellido_duenio = apellido_nombre;
    }

    public MascotaDuenioDTO() {
    }
}
