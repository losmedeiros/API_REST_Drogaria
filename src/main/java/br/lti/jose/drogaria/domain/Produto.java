package br.lti.jose.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codigo;
	
	@Column(length = 50,nullable = false,unique = true)
	private String nome;
	
	@Column(nullable = false)
	private Short quantidade;
	
	@Column(nullable = false,precision = 5,scale = 2)
	private BigDecimal preco;
	
	@Column()
	private LocalDate dataDeValidade;
	
	@ManyToOne 									//muitos produtos para uma categoria
	@JoinColumn(nullable = false)
	private Categoria categoria;

}
