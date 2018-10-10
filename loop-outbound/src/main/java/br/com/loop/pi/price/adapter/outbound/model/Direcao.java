package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Assist\u00eancia", "Pneus dianteiros", "Pneus traseiros" })
public class Direcao implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Assist\u00eancia")
	private String assistencia;

	@JsonProperty("Pneus dianteiros")
	private String pneusDianteiros;

	@JsonProperty("Pneus traseiros")
	private String pneusTraseiros;

	public String getAssistencia() {
		return assistencia;
	}

	public void setAssistencia(String assistencia) {
		this.assistencia = assistencia;
	}

	public String getPneusDianteiros() {
		return pneusDianteiros;
	}

	public void setPneusDianteiros(String pneusDianteiros) {
		this.pneusDianteiros = pneusDianteiros;
	}

	public String getPneusTraseiros() {
		return pneusTraseiros;
	}

	public void setPneusTraseiros(String pneusTraseiros) {
		this.pneusTraseiros = pneusTraseiros;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direcao [");
		if (assistencia != null)
			builder.append("assistencia=").append(assistencia).append(", ");
		if (pneusDianteiros != null)
			builder.append("pneusDianteiros=").append(pneusDianteiros).append(", ");
		if (pneusTraseiros != null)
			builder.append("pneusTraseiros=").append(pneusTraseiros);
		builder.append("]");
		return builder.toString();
	}

	
}
