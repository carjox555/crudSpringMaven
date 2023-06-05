package com.crudspring.crud.service;

import com.crudspring.crud.persistance.modells.Persona;
import com.crudspring.crud.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PersonaServiceImpl implements IntPersonaService{

    private final PersonaRepository personaRepository;
    @Override
    public Persona newPersona(Persona newPersona) {

        return personaRepository.save (newPersona);
    }

    @Override
    public Iterable<Persona> getAll() {
        return this.personaRepository.findAll();
    }

    @Override
    public Persona modifyPersona(Persona persona) {
        //Saber si esta dento de la BD
        Optional<Persona> personaEncontrada=this.personaRepository.findById(persona.getNumDocumento());
        if(personaEncontrada.isEmpty()){
            personaEncontrada.get().setNombre(persona.getNombre());
            personaEncontrada.get().setApellido(persona.getApellido());
            personaEncontrada.get().setEmail(persona.getEmail());
            personaEncontrada.get().setNombre(persona.getNombre());
            return  this.newPersona(personaEncontrada.get());
        }
        return null ;
    }

    @Override
    public Boolean deletePersona(Long idPersona) {
        this.personaRepository.deleteById(idPersona);
        return true;
    }
}