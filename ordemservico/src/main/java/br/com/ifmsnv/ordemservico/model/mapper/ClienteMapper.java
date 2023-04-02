package br.com.ifmsnv.ordemservico.model.mapper;

import br.com.ifmsnv.ordemservico.model.dto.ClienteDto;
import br.com.ifmsnv.ordemservico.model.entities.Cliente;

public class ClienteMapper {
	public static Cliente dtoToEntity( ClienteDto clienteDto ) {
		Cliente cliente = new Cliente();
		cliente.setNome( clienteDto.getNome() );
		cliente.setEmail( clienteDto.getEmail() );
		cliente.setTelefone( clienteDto.getTelefone() );
		cliente.setRua( clienteDto.getRua() );
		cliente.setNumero( clienteDto.getNumero() );
		cliente.setBairro( clienteDto.getBairro() );
		return cliente;
	}
	
	public static ClienteDto entityToDto(Cliente cliente) {
		ClienteDto clienteDto = new ClienteDto();
		clienteDto.setId( cliente.getId() );
		clienteDto.setNome( cliente.getNome() );
		clienteDto.setEmail( cliente.getEmail() );
		cliente.setTelefone( cliente.getTelefone() );
		clienteDto.setRua( cliente.getRua() );
		clienteDto.setNumero( cliente.getNumero() );
		clienteDto.setBairro( cliente.getBairro() );
		return clienteDto;
	}
}
