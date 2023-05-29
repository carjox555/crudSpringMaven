package com.crudspring.crud.controller;

import com.crudspring.crud.modells.Persona;
import com.crudspring.crud.service.IntPersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PersonaController {

    private final IntPersonaService personaServiceImp;

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
        return this.personaServiceImp.modifyPersona(persona);
    }
    @PostMapping(value="/{id}")
    public Boolean deletePersona(@PathVariable(value="id")  Long id){
        return this.personaServiceImp.deletePersona(id);
    }
}
