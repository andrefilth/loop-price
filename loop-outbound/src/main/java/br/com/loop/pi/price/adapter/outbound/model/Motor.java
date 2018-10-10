package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Instala\u00e7\u00e3o", "Aspira\u00e7\u00e3o", "Disposi\u00e7\u00e3o", "Cilindros",
		"V\u00e1lvulas por cilindro" })
public class Motor implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Instala\u00e7\u00e3o")
	private String instalacao;
	
	@JsonProperty("Aspira\u00e7\u00e3o")
	private String aspiracao;
	
	@JsonProperty("Disposi\u00e7\u00e3o")
	private String disposicao;
	
	@JsonProperty("Cilindros")
	private String cilindros;
	
	@JsonProperty("V\u00e1lvulas por cilindro")
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [");
		if (instalacao != null)
			builder.append("instalacao=").append(instalacao).append(", ");
		if (aspiracao != null)
			builder.append("aspiracao=").append(aspiracao).append(", ");
		if (disposicao != null)
			builder.append("disposicao=").append(disposicao).append(", ");
		if (cilindros != null)
			builder.append("cilindros=").append(cilindros).append(", ");
		if (valvulasPorCilindro != null)
			builder.append("valvulasPorCilindro=").append(valvulasPorCilindro);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
