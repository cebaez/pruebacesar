package com.empresa.proyecto.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.empresa.proyecto.emtity.Persona;

public interface PersonaDao extends JpaRepository<Persona, Integer> {

}
