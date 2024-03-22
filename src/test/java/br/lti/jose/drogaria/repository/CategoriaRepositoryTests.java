package br.lti.jose.drogaria.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.lti.jose.drogaria.domain.Categoria;

@SpringBootTest
public class CategoriaRepositoryTests {
	
    @Autowired
	private CategoriaRepository categoriaRepository;
    
    @Test
    public void inserirCategoria() {
    	Categoria c1 = new Categoria(
    			null,
    			"saladas");
    	Categoria c2 = new Categoria(
    			null,
    			"carnes");
    	categoriaRepository.save(c1);
    	categoriaRepository.save(c2);
    }
}
