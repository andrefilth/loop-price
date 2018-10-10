package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Dianteiros", "Traseiros" })
public class Freios implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Dianteiros")
	private String dianteiros;

	@JsonProperty("Traseiros")
	private String traseiros;

	public String getDianteiros() {
		return dianteiros;
	}

	public void setDianteiros(String dianteiros) {
		this.dianteiros = dianteiros;
	}

	public String getTraseiros() {
		return traseiros;
	}

	public void setTraseiros(String traseiros) {
		this.traseiros = traseiros;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Freios [");
		if (dianteiros != null)
			builder.append("dianteiros=").append(dianteiros).append(", ");
		if (traseiros != null)
			builder.append("traseiros=").append(traseiros);
		builder.append("]");
		return builder.toString();
	}

}
