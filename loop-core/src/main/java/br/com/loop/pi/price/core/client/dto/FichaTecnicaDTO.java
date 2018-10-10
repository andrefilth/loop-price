package br.com.loop.pi.price.core.client.dto;

import java.io.Serializable;

public class FichaTecnicaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String configuracao;

	private String ocupantes;

	private String portas;

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

	
}
