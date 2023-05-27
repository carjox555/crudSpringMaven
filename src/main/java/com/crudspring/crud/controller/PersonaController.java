package com.crudspring.crud.controller;

import com.crudspring.crud.modells.Persona;
import com.crudspring.crud.service.PersonaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PersonaController {

    private PersonaServiceImpl personaServiceImp;

    @PostMapping("/nuevo")
    public Persona newPersona(@RequestBody Persona newPersona){
        return this.personaServiceImp.newPersona(newPersona);
    }
    @GetMapping("/mostrar")
    public Iterable<Persona>getAll(){
        return this.personaServiceImp.getAll();
    }
    @PostMapping("/update")
    public Persona updatePersona(Persona persona){
        return this.personaServiceImp.modifyPErsona(persona);
    }
    @PostMapping(value="/{id}")
    public Boolean deletePersona(@PathVariable(value="id")  Long idPersona){
        return this.personaServiceImp.deletePersona(idPersona);
    }
}
