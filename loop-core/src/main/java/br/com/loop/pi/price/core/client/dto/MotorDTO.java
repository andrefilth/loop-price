package br.com.loop.pi.price.core.client.dto;

import java.io.Serializable;

public class MotorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String instalacao;

	private String aspiracao;

	private String disposicao;

	private String cilindros;

	private String valvulasPorCilindro;

	public String getInstalacao() {
		return instalacao;
	}

	public void setInstalacao(String instalacao) {
		this.instalacao = instalacao;
	}

	public String getAspiracao() {
		return aspiracao;
	}

	public void setAspiracao(String aspiracao) {
		this.aspiracao = aspiracao;
	}

	public String getDisposicao() {
		return disposicao;
	}

	public void setDisposicao(String disposicao) {
		this.disposicao = disposicao;
	}

	public String getCilindros() {
		return cilindros;
	}

	public void setCilindros(String cilindros) {
		this.cilindros = cilindros;
	}

	public String getValvulasPorCilindro() {
		return valvulasPorCilindro;
	}

	public void setValvulasPorCilindro(String valvulasPorCilindro) {
		this.valvulasPorCilindro = valvulasPorCilindro;
	}

}
