package com.pgm.cursomc.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.pgm.cursomc.cursomc.domain.enums.EstadoPagamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Date dataVencimento;
	private Date dataPagamento;

	public PagamentoComBoleto(Integer id, EstadoPagamento status, Pedido pedido, Date dataVencimento,
			Date dataPagamento) {
		super(id, status, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

}