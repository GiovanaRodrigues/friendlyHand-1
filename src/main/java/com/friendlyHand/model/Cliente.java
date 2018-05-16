package com.friendlyHand.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"id_cliente",
	"nome",
	"email",
	"cpf",
	"dataNascimento",
	"senha",
	"endereco",
	"servico_contratados"
	})
	
	@Entity
	public class Cliente{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id_cliente")
	private int id;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("email")
	private String email;
	@JsonProperty("cpf")
	private String cpf;
	@JsonProperty("dataNascimento")
	private String dataNascimento;
	@JsonProperty("senha")
	private String senha;
	@OneToOne
	@JsonProperty("endereco")
	private Endereco endereco;
	@OneToMany
	@JsonProperty("servico_contratados")
	private List<ServicoContratado> servicosContratados;
	

	@JsonProperty("id_cliente")
	public int getId() {
	return id;
	}

	@JsonProperty("id_cliente")
	public void setId(int id) {
	this.id = id;
	}

	@JsonProperty("nome")
	public String getNome() {
	return nome;
	}

	@JsonProperty("nome")
	public void setNome(String nome) {
	this.nome = nome;
	}

	@JsonProperty("email")
	public String getEmail() {
	return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
	this.email = email;
	}

	@JsonProperty("senha")
	public String getSenha() {
	return senha;
	}

	@JsonProperty("senha")
	public void setSenha(String senha) {
	this.senha = senha;
	}

	@JsonProperty("cpf")
	public String getCpf() {
		return cpf;
	}

	@JsonProperty("cpf")
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@JsonProperty("dataNascimento")
	public String getDataNascimento() {
		return dataNascimento;
	}

	@JsonProperty("dataNascimento")
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@JsonProperty("endereco")
	public Endereco getEndereco() {
		return endereco;
	}

	@JsonProperty("endereco")
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@JsonProperty("servico_contratados")
	public List<ServicoContratado> getServicosContratados() {
		return servicosContratados;
	}

	@JsonProperty("servico_contratados")
	public void setServicosContratados(List<ServicoContratado> servicosContratados) {
		this.servicosContratados = servicosContratados;
	}

}



