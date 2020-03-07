package com.pgm.cursomc.cursomc.domain;

import javax.persistence.Entity;

import com.pgm.cursomc.cursomc.domain.enums.EstadoPagamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PagamentoComCartao extends Pagamento {

	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;

	public PagamentoComCartao(Integer id, EstadoPagamento status, Pedido pedido, Integer numeroDeParcelas) {
		super(id, status, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

}