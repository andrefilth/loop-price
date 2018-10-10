package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Configura\u00e7\u00e3o", "Ocupantes", "Portas" })
public class FichaTecnica implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Configura\u00e7\u00e3o")
	public String configuracao;
	
	@JsonProperty("Ocupantes")
	public String ocupantes;
	
	@JsonProperty("Portas")
	public String portas;

	public String getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}

	public String getOcupantes() {
		return ocupantes;
	}

	public void setOcupantes(String ocupantes) {
		this.ocupantes = ocupantes;
	}

	public String getPortas() {
		return portas;
	}

	public void setPortas(String portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FichaTecnica [");
		if (configuracao != null)
			builder.append("configuracao=").append(configuracao).append(", ");
		if (ocupantes != null)
			builder.append("ocupantes=").append(ocupantes).append(", ");
		if (portas != null)
			builder.append("portas=").append(portas);
		builder.append("]");
		return builder.toString();
	}

}
