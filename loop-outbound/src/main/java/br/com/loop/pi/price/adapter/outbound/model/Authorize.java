package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Nome", "Token", "Email", "Requests" })
public class Authorize implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Nome")
	private String nome;

	@JsonProperty("Token")
	private String token;

	@JsonProperty("Email")
	private String email;

	@JsonProperty("Requests")
	private Integer requests;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getRequests() {
		return requests;
	}

	public void setRequests(Integer requests) {
		this.requests = requests;
	}

	@Override
	public String toString() {
		return "Authorize [" + (nome != null ? "nome=" + nome + ", " : "")
				+ (token != null ? "token=" + token + ", " : "") + (email != null ? "email=" + email + ", " : "")
				+ (requests != null ? "requests=" + requests : "") + "]";
	}

	
}
