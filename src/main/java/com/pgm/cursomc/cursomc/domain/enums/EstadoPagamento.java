package com.pgm.cursomc.cursomc.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EstadoPagamento {

	PENDENTE(1, "Pessoa Física"), QUITADO(2, "Quitado"), CANCELADO(3, "Cancelado");

	private Integer cod;
	private String descricao;

	public static EstadoPagamento toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}

			throw new IllegalArgumentException("ID inválido: " + cod);
		}
		return null;
	}

}