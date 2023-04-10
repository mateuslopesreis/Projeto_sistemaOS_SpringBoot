package br.com.ifmsnv.ordemservico.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifmsnv.ordemservico.controller.dto.ClienteRequest;
import br.com.ifmsnv.ordemservico.controller.dto.ClienteResponse;
import br.com.ifmsnv.ordemservico.controller.mapper.ClienteMapper;
import br.com.ifmsnv.ordemservico.model.dto.ClienteDto;
import br.com.ifmsnv.ordemservico.model.services.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/cliente")
@Tag(name = "Cliente", description = "Gerenciamento de clientes")

public class ClienteController {

	
private final ClienteService clienteService;
	
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	
	@GetMapping
	public ResponseEntity<String> olamundo() {
		return ResponseEntity.ok("Ola mundo");
	}
	
	
	@Operation(summary = "Novo recurso", description = "Serviço para cadastrar um recurso")
	@ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Operação de sucesso",
	        content = @Content(mediaType = "application/json", schema = @Schema(implementation = ClienteResponse.class))),
	    @ApiResponse(responseCode = "500", description = "Falha no serviço", content = @Content)
	})

	
	
	
	
	@PostMapping
	public ResponseEntity<ClienteResponse> create(
				@RequestBody @Valid ClienteRequest clienteRequest){
		 ClienteDto clienteDto = ClienteMapper.requestToDto(clienteRequest);
		 ClienteDto clienteDto2 = clienteService.create(clienteDto);
		 
		 
		 
		 
		ClienteResponse clienteResponse = ClienteMapper.dtoToResponse(clienteDto2);
		return ResponseEntity.ok(clienteResponse);

	
}
}

