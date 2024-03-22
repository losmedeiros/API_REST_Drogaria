package br.lti.jose.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.lti.jose.drogaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short> {	

	
}
