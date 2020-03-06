package com.pgm.cursomc.cursomc.repositories;

import com.pgm.cursomc.cursomc.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}