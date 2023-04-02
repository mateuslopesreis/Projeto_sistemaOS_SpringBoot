package br.com.ifmsnv.ordemservico.controller.dto;

import java.time.Instant;
import java.util.UUID;

public class ClienteResponse {
	private String nome;
	private String email;
	private String telefone;
	private String rua;
	private String numero;
	private String bairro;
	
	private UUID id;
	private Instant dtCadastro;
	private Instant dtAtualizacao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Instant getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Instant dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public Instant getDtAtualizacao() {
		return dtAtualizacao;
	}
	public void setDtAtualizacao(Instant dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
	
	
}
