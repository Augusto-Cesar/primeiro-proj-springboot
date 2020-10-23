package com.example.teste.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.teste.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Test
	public void inserir() {
		Produto p1 = new Produto(
				null, 
				"agua", 
				Byte.valueOf("10"), 
				BigDecimal.valueOf(10.50), 
				LocalDate.of(2023, 10, 20),
				true, 
				null);
		
		Produto p2 = new Produto(
				null, 
				"suco", 
				Byte.valueOf("13"), 
				BigDecimal.valueOf(12.50), 
				LocalDate.of(2023, 10, 20),
				true,
				null);
		
		produtoRepository.save(p1);
		produtoRepository.save(p2);
	}
}
