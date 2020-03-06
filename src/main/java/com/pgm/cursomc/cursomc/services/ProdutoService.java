package com.pgm.cursomc.cursomc.services;

import java.util.Optional;

import com.pgm.cursomc.cursomc.domain.Produto;
import com.pgm.cursomc.cursomc.repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository prodRepo;

	public Produto buscar(Integer id) {
		Optional<Produto> obj = prodRepo.findById(id);
		return obj.orElse(null);
	}

}