package com.pgm.cursomc.cursomc.services;

import java.util.Optional;

import com.pgm.cursomc.cursomc.domain.Categoria;
import com.pgm.cursomc.cursomc.repositories.CategoriaRepository;
import com.pgm.cursomc.cursomc.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository catRepo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = catRepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado para o ID " + id + ", Tipo: " + Categoria.class.getName()));
		// return obj.orElse(null);
	}

}