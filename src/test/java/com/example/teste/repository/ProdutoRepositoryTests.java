package com.example.teste.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.teste.domain.Categoria;
import com.example.teste.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Test
	public void inserir() {
		Produto p1 = new Produto(
				null, 
				"Biscoto Maria", 
				Byte.valueOf("10"), 
				BigDecimal.valueOf(2.50), 
				LocalDate.of(2023, 10, 20),
				true, 
				new Categoria((short) 5, "massas"));
		
		Produto p2 = new Produto(
				null, 
				"Biscoito Maizena", 
				Byte.valueOf("20"), 
				BigDecimal.valueOf(2.25), 
				LocalDate.of(2023, 10, 20),
				true,
				new Categoria((short) 5, "massas"));
		
		produtoRepository.save(p1);
		produtoRepository.save(p2);
	}
}
