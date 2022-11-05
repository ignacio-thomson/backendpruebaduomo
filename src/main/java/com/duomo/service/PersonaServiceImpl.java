package com.duomo.service;

import com.duomo.dao.PersonaDAO;
import com.duomo.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDAO dao;

    @Override
    @Transactional
    public Persona save(Persona persona) {
        return dao.save(persona);
    }

    @Override
    @Transactional
    public List<Persona> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional
    public Persona findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        dao.deleteById(id);
    }
}
