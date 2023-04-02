package br.com.ifmsnv.ordemservico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrdemservicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdemservicoApplication.class, args);
	}
	
	@GetMapping("/olamundo")
	public ResponseEntity<String> olaMundo(){
		return ResponseEntity.ok("Ola mundo");
	}

}
