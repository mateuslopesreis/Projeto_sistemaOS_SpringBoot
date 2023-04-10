package br.com.ifmsnv.ordemservico.model.services;

import org.springframework.stereotype.Service;

import br.com.ifmsnv.ordemservico.model.dto.ClienteDto;
import br.com.ifmsnv.ordemservico.model.entities.Cliente;
import br.com.ifmsnv.ordemservico.model.mapper.ClienteMapper;
import br.com.ifmsnv.ordemservico.model.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private final ClienteRepository repository;
	
	public ClienteService(ClienteRepository repository) {
		this.repository = repository;
	}
	
	public ClienteDto create(ClienteDto clienteDto) {
		clienteDto.setNome(clienteDto.getNome().toUpperCase());
		clienteDto.setEmail(clienteDto.getNome().toLowerCase());
		clienteDto.setTelefone(clienteDto.getTelefone());
		clienteDto.setRua(clienteDto.getRua());
		clienteDto.setNumero(clienteDto.getNumero());
		clienteDto.setBairro(clienteDto.getNome());
		
		if(repository.existsByEmail(clienteDto.getEmail())) {
			throw new RuntimeException("Email já existe para outro cliente");
		}
		
		
		Cliente cliente = ClienteMapper.dtoToEntity(clienteDto);
		repository.save(cliente);
		return ClienteMapper.entityToDto(cliente);
	}

}







	
	
	
	





	