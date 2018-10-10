package br.com.loop.pi.price.core.client.dto;

import java.io.Serializable;

public class TransmissaoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String tracao;
	
	private String cambio;

	public String getTracao() {
		return tracao;
	}

	public void setTracao(String tracao) {
		this.tracao = tracao;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	
}
