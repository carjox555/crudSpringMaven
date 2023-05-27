package com.crudspring.crud.service;

import com.crudspring.crud.modells.Persona;

public interface IntPersonaService {
    Persona newPersona(Persona newPersona);

    Iterable<Persona> getAll();

    Persona modifyPErsona(Persona persona);

    Boolean deletePersona(Long idPersona);
}
