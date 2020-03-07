package com.pgm.cursomc.cursomc.services;

import java.util.Optional;

import com.pgm.cursomc.cursomc.domain.Cliente;
import com.pgm.cursomc.cursomc.repositories.ClienteRepository;
import com.pgm.cursomc.cursomc.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository cliRepo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = cliRepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado para o ID " + id + ", Tipo: " + Cliente.class.getName()));
		// return obj.orElse(null);
	}

}