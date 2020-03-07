package com.pgm.cursomc.cursomc.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Jurpidica"), PESSOAJURIDICA(2, "Pessoa Física");

	private Integer cod;
	private String descricao;

	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}

			throw new IllegalArgumentException("ID inválido: " + cod);
		}
		return null;
	}

}