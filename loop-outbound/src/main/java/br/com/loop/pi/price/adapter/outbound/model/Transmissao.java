package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Tra\u00e7\u00e3o", "C\u00e2mbio" })
public class Transmissao implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Tra\u00e7\u00e3o")
	private String tracao;
	
	@JsonProperty("C\u00e2mbio")
	private String cambio;

	public String getTracao() {
		return tracao;
	}

	public void setTracao(String tracao) {
		this.tracao = tracao;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transmissao [");
		if (tracao != null)
			builder.append("tracao=").append(tracao).append(", ");
		if (cambio != null)
			builder.append("cambio=").append(cambio);
		builder.append("]");
		return builder.toString();
	}
	
}
