package com.pgm.cursomc.cursomc.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
}