package br.lti.jose.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ProdutoTests {

	
	@Test
	public void criar() {

		Produto p = new Produto(
				Short.valueOf("1"),
				"coca cola",Short.valueOf("15"),
				BigDecimal.valueOf(10.50),
				LocalDate.of(2023, 11, 05),
				null);
		
		System.out.println(p);	


	}

}
