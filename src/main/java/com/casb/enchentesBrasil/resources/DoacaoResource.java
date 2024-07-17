package com.casb.enchentesBrasil.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casb.enchentesBrasil.entities.CentroDistribuicao;
import com.casb.enchentesBrasil.entities.Doacao;

@RestController
@RequestMapping(value = "/doacoes")
public class DoacaoResource {

	@GetMapping
	public ResponseEntity<Doacao> findAll(){
		CentroDistribuicao cd = new CentroDistribuicao();
		Doacao d = new Doacao();
		return ResponseEntity.ok().body(d);
	}
}
