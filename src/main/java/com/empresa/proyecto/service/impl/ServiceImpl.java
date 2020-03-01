package com.empresa.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.proyecto.dao.PersonaDao;
import com.empresa.proyecto.emtity.Persona;
import com.empresa.proyecto.service.PersonaService;

@Service
public class ServiceImpl implements PersonaService {

	@Autowired
	public PersonaDao perDao;

	@Override
	public List<Persona> listarPersona() {
		return perDao.findAll();
	}

	@Override
	public int crearPersona(Persona p) {
		Persona per = perDao.save(p);
		if (per == null) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public Persona buscarPersona(Persona p) {
		return perDao.findById(p.getId()).get();
	}

	@Override
	public int actualizarPersona(Persona p) {
		Persona per = perDao.save(p);
		if (per == null) {
			return 0;
		} else {
			return 1;
		}

	}

	@Override
	public int borrarPersona(Persona p) {
		perDao.delete(p);
		return 1;
	}

}
