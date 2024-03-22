package br.lti.jose.drogaria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.lti.jose.drogaria.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	
	@Test
	public void inserir() {
		
		
		Produto p1 = new Produto(
				null, 												//como esta sendo gerenciado pelo banco de dados eu coloco null
				"coca cola",
				Short.valueOf("15"),
				BigDecimal.valueOf(10.50),
				LocalDate.of(2023, 11, 05),
				null
				
				);
		
		Produto p2 = new Produto(
				null, 												//como esta sendo gerenciado pelo banco de dados eu coloco null
				"Heineken",
				Short.valueOf("23"),
				BigDecimal.valueOf(08.00),
				LocalDate.of(2024, 05, 17),
				null
				);
		produtoRepository.save(p1);
		produtoRepository.save(p2);
		
	}

}
