package com.pgm.cursomc.cursomc.repositories;

import com.pgm.cursomc.cursomc.domain.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}