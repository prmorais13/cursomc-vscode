package com.pgm.cursomc.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.pgm.cursomc.cursomc.domain.enums.EstadoPagamento;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	@Id
	private Integer id;
	private Integer status;
	@Getter
	@Setter
	@OneToOne
	@JoinColumn(name = "pedido_id")
	@MapsId
	private Pedido pedido;

	public Pagamento(Integer id, EstadoPagamento status, Pedido pedido) {
		this.id = id;
		this.pedido = pedido;
		this.status = status.getCod();
	}

	public EstadoPagamento getStatus() {
		return EstadoPagamento.toEnum(status);
	}

	public void setStatus(EstadoPagamento status) {
		this.status = status.getCod();
	}

}