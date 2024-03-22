package br.lti.jose.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.lti.jose.drogaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short>{

}
