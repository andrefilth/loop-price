package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "complementExists", "complementFounds", "partsExists" })
public class Config implements Serializable{

	private static final long serialVersionUID = 1L;

	@JsonProperty("complementExists")
	private Boolean complementExists;

	@JsonProperty("complementFounds")
	private Integer complementFounds;

	@JsonProperty("partsExists")
	private Boolean partsExists;

	public Boolean getComplementExists() {
		return complementExists;
	}

	public void setComplementExists(Boolean complementExists) {
		this.complementExists = complementExists;
	}

	public Integer getComplementFounds() {
		return complementFounds;
	}

	public void setComplementFounds(Integer complementFounds) {
		this.complementFounds = complementFounds;
	}

	public Boolean getPartsExists() {
		return partsExists;
	}

	public void setPartsExists(Boolean partsExists) {
		this.partsExists = partsExists;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Config [");
		if (complementExists != null)
			builder.append("complementExists=").append(complementExists).append(", ");
		if (complementFounds != null)
			builder.append("complementFounds=").append(complementFounds).append(", ");
		if (partsExists != null)
			builder.append("partsExists=").append(partsExists);
		builder.append("]");
		return builder.toString();
	}
	
	

}
