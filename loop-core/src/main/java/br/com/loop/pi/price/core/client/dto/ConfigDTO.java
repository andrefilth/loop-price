package br.com.loop.pi.price.core.client.dto;

public class ConfigDTO {

	private Boolean complementExists;

	private Integer complementFounds;

	private Boolean partsExists;

	public Boolean isComplementExists() {
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

	public Boolean isPartsExists() {
		return partsExists;
	}

	public void setPartsExists(Boolean partsExists) {
		this.partsExists = partsExists;
	}
	
	
}
