package com.crudspring.crud.repository;

import com.crudspring.crud.persistance.modells.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
