package com.crudspring.crud.persistance.modells;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Persona_tb")
@Getter
@Setter

    public class Persona {
        @Id
        private Long numDocumento;
        @Column
        private String nombre;
        @Column
        private String apellido;
        @Column
        private String email;
    }

