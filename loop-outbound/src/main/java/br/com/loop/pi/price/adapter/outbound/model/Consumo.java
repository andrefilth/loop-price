package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Urbano", "Rodoviario" })
public class Consumo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@JsonProperty("Urbano")
	public String urbano;
	
	@JsonProperty("Rodoviario")
	public String rodoviario;

	public String getUrbano() {
		return urbano;
	}

	public void setUrbano(String urbano) {
		this.urbano = urbano;
	}

	public String getRodoviario() {
		return rodoviario;
	}

	public void setRodoviario(String rodoviario) {
		this.rodoviario = rodoviario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Consumo [");
		if (urbano != null)
			builder.append("urbano=").append(urbano).append(", ");
		if (rodoviario != null)
			builder.append("rodoviario=").append(rodoviario);
		builder.append("]");
		return builder.toString();
	}

	
}
