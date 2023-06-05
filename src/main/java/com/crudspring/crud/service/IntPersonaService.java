package com.crudspring.crud.service;

import com.crudspring.crud.persistance.modells.Persona;


public interface IntPersonaService {
    Persona newPersona(Persona newPersona);

    Iterable<Persona> getAll();

    Persona modifyPersona(Persona persona);

    Boolean deletePersona(Long idPersona);


}
