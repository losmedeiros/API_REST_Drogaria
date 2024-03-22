package br.lti.jose.drogaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drogaria")
public class DorgariaController {
	@RequestMapping("/ola")
	public String exibirMensagem() {
		return "Olá Mundo";
	}
}
