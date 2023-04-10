package br.com.ifmsnv.ordemservico.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ClienteRequest {
	
	@Size(max = 80, message = "Informe o nome completo")
	@NotBlank
	private String nome;
	
	@Size(max= 150, message = "Informe um endereço de e-mail")
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String telefone;
	
	@Size(max = 150, message = "Informe o nome da rua")
	@NotBlank
	private String rua;
	
	@NotBlank
	private String numero;
	
	@Size(max = 150, message = "Informe o nome do bairro")
	@NotBlank
	private String bairro;
	
	
	
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
}



