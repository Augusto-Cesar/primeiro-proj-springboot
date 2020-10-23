package com.example.teste.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {
	@Test
	public void criar() {
		Produto p = new Produto(
				1, 
				"agua", 
				Byte.valueOf("10"), 
				BigDecimal.valueOf(10.50), 
				LocalDate.of(2023, 10, 20),
				true,
				null);
		System.out.println(p);
	}
}
