package com.pgm.cursomc.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriasResource {

	@GetMapping()
	public String listar() {
		return "REST api funcionando!";
	}

}