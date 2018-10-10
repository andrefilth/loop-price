package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Velocidade m\u00e1xima" })
public class Desempenho implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Velocidade m\u00e1xima")
	private String velocidadeMaxima;

	public String getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(String velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Desempenho [");
		if (velocidadeMaxima != null)
			builder.append("velocidadeMaxima=").append(velocidadeMaxima);
		builder.append("]");
		return builder.toString();
	}

}
