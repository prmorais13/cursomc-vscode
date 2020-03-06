package com.pgm.cursomc.cursomc;

import java.util.Arrays;

import com.pgm.cursomc.cursomc.domain.Categoria;
import com.pgm.cursomc.cursomc.domain.Cidade;
import com.pgm.cursomc.cursomc.domain.Estado;
import com.pgm.cursomc.cursomc.domain.Produto;
import com.pgm.cursomc.cursomc.repositories.CategoriaRepository;
import com.pgm.cursomc.cursomc.repositories.CidadeRepository;
import com.pgm.cursomc.cursomc.repositories.EstadoRepository;
import com.pgm.cursomc.cursomc.repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository catRepo;

	@Autowired
	private ProdutoRepository prodRepo;

	@Autowired
	private EstadoRepository estRepo;

	@Autowired
	private CidadeRepository cidRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		catRepo.saveAll(Arrays.asList(cat1, cat2));
		prodRepo.saveAll(Arrays.asList(p1, p2, p3));

		Estado est1 = new Estado(null, "Rio Grande do Norte");
		Estado est2 = new Estado(null, "Paraíba");
		Estado est3 = new Estado(null, "Ceará");

		Cidade cid1 = new Cidade(null, "Natal", est1);
		Cidade cid2 = new Cidade(null, "Parnamirim", est1);
		Cidade cid3 = new Cidade(null, "Campina Grande", est2);
		Cidade cid4 = new Cidade(null, "Fortaleza", est3);

		est1.getCidades().addAll(Arrays.asList(cid1, cid2));
		est2.getCidades().addAll(Arrays.asList(cid3));
		est3.getCidades().addAll(Arrays.asList(cid4));

		estRepo.saveAll(Arrays.asList(est1, est2, est3));
		cidRepo.saveAll(Arrays.asList(cid1, cid2, cid3, cid4));

	}

}
