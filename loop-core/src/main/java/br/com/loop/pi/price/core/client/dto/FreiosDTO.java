package br.com.loop.pi.price.core.client.dto;

import java.io.Serializable;

public class FreiosDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String dianteiros;

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


	
}
