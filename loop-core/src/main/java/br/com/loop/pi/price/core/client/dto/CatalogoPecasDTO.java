package br.com.loop.pi.price.core.client.dto;

import java.io.Serializable;

public class CatalogoPecasDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idMontadora;

	private String idModelo;

	private String modeloSuiv;

	private String idVersao;

	private String versaoSuiv;

	private String rangeInicial;

	private String rangeFinal;

	public String getIdMontadora() {
		return idMontadora;
	}

	public void setIdMontadora(String idMontadora) {
		this.idMontadora = idMontadora;
	}

	public String getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(String idModelo) {
		this.idModelo = idModelo;
	}

	public String getModeloSuiv() {
		return modeloSuiv;
	}

	public void setModeloSuiv(String modeloSuiv) {
		this.modeloSuiv = modeloSuiv;
	}

	public String getIdVersao() {
		return idVersao;
	}

	public void setIdVersao(String idVersao) {
		this.idVersao = idVersao;
	}

	public String getVersaoSuiv() {
		return versaoSuiv;
	}

	public void setVersaoSuiv(String versaoSuiv) {
		this.versaoSuiv = versaoSuiv;
	}

	public String getRangeInicial() {
		return rangeInicial;
	}

	public void setRangeInicial(String rangeInicial) {
		this.rangeInicial = rangeInicial;
	}

	public String getRangeFinal() {
		return rangeFinal;
	}

	public void setRangeFinal(String rangeFinal) {
		this.rangeFinal = rangeFinal;
	}

	
}
