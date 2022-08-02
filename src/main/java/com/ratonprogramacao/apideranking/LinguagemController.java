package com.ratonprogramacao.apideranking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

	@Autowired
	private LinguagemRepository repositorio;

	/*
	 * Teste do Spring
	 * 
	 * @GetMapping("/linguagem-preferida") public String
	 * processaLinguagemPreferida() { return "Oi, Java!"; }
	 */

	// A anotação /linguagens define o fim do link a ser usado para a visualização
	// da API. Modificar como for necessário
	@GetMapping("/linguagens")
	public List<Linguagem> obterLinguagens() {
		List<Linguagem> linguagens = repositorio.findAll();
		return linguagens;
	}

	// A anotação /linguagens define o fim do link a ser usado para a visualização
	// da API. Modificar como for necessário
	@PostMapping("/linguagens")
	public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
		Linguagem linguagemSalva = repositorio.save(linguagem);
		return linguagemSalva;

	}



}
