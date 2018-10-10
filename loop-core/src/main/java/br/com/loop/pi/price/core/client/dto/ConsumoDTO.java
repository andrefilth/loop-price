package br.com.loop.pi.price.core.client.dto;

import java.io.Serializable;

public class ConsumoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String urbano;

	private String rodoviario;

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

	
}
