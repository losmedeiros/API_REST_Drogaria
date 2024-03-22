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

import br.lti.jose.drogaria.domain.Categoria;
import br.lti.jose.drogaria.repository.CategoriaRepository;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listar(){
		List<Categoria> Categorias = categoriaRepository.findAll();
		return Categorias;
	}
	@GetMapping("buscar/{codigo}")
	public Categoria buscar(@PathVariable Short codigo) {
		Optional<Categoria> resultado = categoriaRepository.findById(codigo);
		Categoria categoria = resultado.get();
		return categoria;
	}
	
	@PostMapping
	public Categoria inserir(@RequestBody Categoria categoria) {
		Categoria categoriaSalva = categoriaRepository.save(categoria);
		return categoriaSalva;
	}
	
	@DeleteMapping("{codigo}")
	public Optional<Categoria> excluir(@PathVariable Short codigo){
		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
		Categoria categoriaRetorno = categoria.get();
		categoriaRepository.delete(categoriaRetorno);
		return categoria;
		
	}
	
	@PutMapping
	public Categoria editar (@RequestBody Categoria categoria) {
		Categoria categoriaEditada = categoriaRepository.save(categoria);
		return categoriaEditada;
	}
	

}
