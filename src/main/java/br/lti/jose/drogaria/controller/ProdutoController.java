package br.lti.jose.drogaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.lti.jose.drogaria.domain.Produto;
import br.lti.jose.drogaria.repository.ProdutoRepository;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping()
	public List<Produto> listar(){
		List<Produto> produtos = produtoRepository.findAll();
		return produtos;
	}
	@PostMapping
	public Produto inserir (@RequestBody Produto produto) {
		Produto produtoSalvo = produtoRepository.save(produto);
		return produtoSalvo;
	}
	@DeleteMapping("deletar/{codigo}")
	public Optional<Produto> excluir(@PathVariable Short codigo) {
		Optional<Produto> produtoExcluir = produtoRepository.findById(codigo);
		produtoRepository.deleteById(codigo);
		return produtoExcluir;
		
	}
	@PutMapping
	public Produto alterar(@RequestBody Produto produto) {
		Produto produtoalterar = produtoRepository.save(produto);
		return produtoalterar;
		
	}
		
	

}
