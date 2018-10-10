package br.com.loop.pi.price.core.client.dto;

import java.io.Serializable;

public class DirecaoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String assistencia;

	private String pneusDianteiros;

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
	
	
}
