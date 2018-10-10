package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "fipe", "descVersao", "descAno", "Combustivel", "Preco", "CatalogoPecas", "FichaTecnica", "Motor",
		"Transmiss\u00e3o", "Freios", "Dire\u00e7\u00e3o", "Dimens\u00f5es", "Desempenho", "Consumo" })
public class Complemento implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("fipe")
	public String fipe;

	@JsonProperty("descVersao")
	public String descVersao;

	@JsonProperty("descAno")
	public String descAno;

	@JsonProperty("Combustivel")
	public String combustivel;

	@JsonProperty("Preco")
	public String preco;

	@JsonProperty("CatalogoPecas")
	public CatalogoPecas catalogoPecas;

	@JsonProperty("FichaTecnica")
	public FichaTecnica fichaTecnica;

	@JsonProperty("Motor")
	public Motor motor;

	@JsonProperty("Transmiss\u00e3o")
	public Transmissao transmissao;

	@JsonProperty("Freios")
	public Freios freios;

	@JsonProperty("Dire\u00e7\u00e3o")
	public Direcao direcao;

	@JsonProperty("Dimens\u00f5es")
	public Dimensoes dimensoes;

	@JsonProperty("Desempenho")
	public Desempenho desempenho;

	@JsonProperty("Consumo")
	public Consumo consumo;

	public String getFipe() {
		return fipe;
	}

	public void setFipe(String fipe) {
		this.fipe = fipe;
	}

	public String getDescVersao() {
		return descVersao;
	}

	public void setDescVersao(String descVersao) {
		this.descVersao = descVersao;
	}

	public String getDescAno() {
		return descAno;
	}

	public void setDescAno(String descAno) {
		this.descAno = descAno;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public CatalogoPecas getCatalogoPecas() {
		return catalogoPecas;
	}

	public void setCatalogoPecas(CatalogoPecas catalogoPecas) {
		this.catalogoPecas = catalogoPecas;
	}

	public FichaTecnica getFichaTecnica() {
		return fichaTecnica;
	}

	public void setFichaTecnica(FichaTecnica fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;
	}

	public Freios getFreios() {
		return freios;
	}

	public void setFreios(Freios freios) {
		this.freios = freios;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	public Dimensoes getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(Dimensoes dimensoes) {
		this.dimensoes = dimensoes;
	}

	public Desempenho getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(Desempenho desempenho) {
		this.desempenho = desempenho;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Complemento [");
		if (fipe != null)
			builder.append("fipe=").append(fipe).append(", ");
		if (descVersao != null)
			builder.append("descVersao=").append(descVersao).append(", ");
		if (descAno != null)
			builder.append("descAno=").append(descAno).append(", ");
		if (combustivel != null)
			builder.append("combustivel=").append(combustivel).append(", ");
		if (preco != null)
			builder.append("preco=").append(preco).append(", ");
		if (catalogoPecas != null)
			builder.append("catalogoPecas=").append(catalogoPecas).append(", ");
		if (fichaTecnica != null)
			builder.append("fichaTecnica=").append(fichaTecnica).append(", ");
		if (motor != null)
			builder.append("motor=").append(motor).append(", ");
		if (transmissao != null)
			builder.append("transmissao=").append(transmissao).append(", ");
		if (freios != null)
			builder.append("freios=").append(freios).append(", ");
		if (direcao != null)
			builder.append("direcao=").append(direcao).append(", ");
		if (dimensoes != null)
			builder.append("dimensoes=").append(dimensoes).append(", ");
		if (desempenho != null)
			builder.append("desempenho=").append(desempenho).append(", ");
		if (consumo != null)
			builder.append("consumo=").append(consumo);
		builder.append("]");
		return builder.toString();
	}

}
