package br.com.ifmsnv.ordemservico.model.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifmsnv.ordemservico.model.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID>{

	Boolean existsByEmail(String email);
	
}




