package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Porta-malas", "Tanque de combust\u00edvel", "Peso" })
public class Dimensoes implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Porta-malas")
	private String portaMalas;
	
	@JsonProperty("Tanque de combust\u00edvel")
	private String tanqueDeCombustivel;
	
	@JsonProperty("Peso")
	private String peso;

	public String getPortaMalas() {
		return portaMalas;
	}

	public void setPortaMalas(String portaMalas) {
		this.portaMalas = portaMalas;
	}

	public String getTanqueDeCombustivel() {
		return tanqueDeCombustivel;
	}

	public void setTanqueDeCombustivel(String tanqueDeCombustivel) {
		this.tanqueDeCombustivel = tanqueDeCombustivel;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dimensoes [");
		if (portaMalas != null)
			builder.append("portaMalas=").append(portaMalas).append(", ");
		if (tanqueDeCombustivel != null)
			builder.append("tanqueDeCombustivel=").append(tanqueDeCombustivel).append(", ");
		if (peso != null)
			builder.append("peso=").append(peso);
		builder.append("]");
		return builder.toString();
	}

}
