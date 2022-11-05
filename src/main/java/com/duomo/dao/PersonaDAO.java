package com.duomo.dao;


import com.duomo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {



}
