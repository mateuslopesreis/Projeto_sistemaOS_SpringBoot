package br.com.ifmsnv.ordemservico.controller.mapper;

import br.com.ifmsnv.ordemservico.controller.dto.ClienteRequest;
import br.com.ifmsnv.ordemservico.controller.dto.ClienteResponse;
import br.com.ifmsnv.ordemservico.model.dto.ClienteDto;

public class ClienteMapper {
	
	public static ClienteDto requestToDto( ClienteRequest clienteRequest ) {
		ClienteDto clienteDto = new ClienteDto();
		clienteDto.setNome( clienteRequest.getNome() );
		clienteDto.setEmail( clienteRequest.getEmail() );
		clienteDto.setTelefone( clienteRequest.getTelefone());
		clienteDto.setRua( clienteRequest.getRua() );
		clienteDto.setNumero( clienteRequest.getNumero() );
		clienteDto.setBairro( clienteRequest.getBairro() );
		return clienteDto;
	}
	
	public static ClienteResponse dtoToResponse( ClienteDto clienteDto ) {
		ClienteResponse clienteResponse = new ClienteResponse();
		clienteResponse.setId( clienteDto.getId() );
		clienteResponse.setNome( clienteDto.getNome() );
		clienteResponse.setEmail( clienteDto.getEmail() );
		clienteResponse.setTelefone( clienteDto.getTelefone() );
		clienteResponse.setRua( clienteDto.getRua() );
		clienteResponse.setNumero( clienteDto.getNumero() );
		clienteResponse.setBairro( clienteDto.getBairro() );
		return clienteResponse;
	}

}