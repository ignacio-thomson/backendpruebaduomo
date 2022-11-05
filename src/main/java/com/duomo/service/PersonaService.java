package com.duomo.service;

import com.duomo.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaService {

    public Persona save(Persona persona);
    public List<Persona> findAll();
    public Persona findById(Integer id);
    public void delete(Integer id);

}
