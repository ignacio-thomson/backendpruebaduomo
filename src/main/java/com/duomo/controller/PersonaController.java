package com.duomo.controller;

import com.duomo.model.Persona;
import com.duomo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    private PersonaService svc;

    @GetMapping("/personas")
    public List<Persona> personaList(){
        return svc.findAll();
    }

    @PostMapping("/personas")
    public Persona guardar(@RequestBody Persona persona){
        return svc.save(persona);
    }

    @GetMapping("/personas/{id}")
    public Persona getPersona(@PathVariable Integer id){
        return svc.findById(id);
    }

    @PutMapping("/personas/{id}")
    public Persona modificar(@RequestBody Persona persona, @PathVariable Integer id){

        Persona personaActual = svc.findById(id);
        personaActual.setNombre(persona.getNombre());
        personaActual.setApellido(persona.getApellido());
        personaActual.setFechaNacimiento(persona.getFechaNacimiento());
        personaActual.setTelefono(persona.getTelefono());
        personaActual.setRegion(persona.getRegion());
        personaActual.setComuna(persona.getComuna());

        return svc.save(personaActual);
    }

    @DeleteMapping("/personas/{id}")
    public void eliminar(@PathVariable Integer id){
        svc.delete(id);
    }

}
