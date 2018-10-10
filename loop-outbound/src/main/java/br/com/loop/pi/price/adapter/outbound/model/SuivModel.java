package br.com.loop.pi.price.adapter.outbound.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Authorize", "Placa", "Marca", "Modelo", "Versao", "Motorizacao", "Chassis", "AnoFab", "AnoMod",
		"Combustivel", "Segmento", "Subsegmento", "Carroceria", "Potencia", "Procedencia", "EixosQtd", "PBT", "CMT",
		"Cilindradas", "NumLugares", "CapacCarga", "NumCaixaCambio", "NumEixoTras", "NumEixoAux", "NumMotor",
		"relatedFipe", "config", "complemento"})
public class SuivModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Authorize")
	public Authorize authorize;
	
	@JsonProperty("Placa")
	public String placa;
	
	@JsonProperty("Marca")
	public String marca;
	
	@JsonProperty("Modelo")
	public String modelo;
	
	@JsonProperty("Versao")
	public String versao;
	
	@JsonProperty("Motorizacao")
	public String motorizacao;
	
	@JsonProperty("Chassis")
	public String chassis;
	
	@JsonProperty("AnoFab")
	public String anoFab;
	
	@JsonProperty("AnoMod")
	public String anoMod;
	
	@JsonProperty("Combustivel")
	public String combustivel;
	
	@JsonProperty("Segmento")
	public String segmento;
	
	@JsonProperty("Subsegmento")
	public String subsegmento;
	
	@JsonProperty("Carroceria")
	public String carroceria;
	
	@JsonProperty("Potencia")
	public String potencia;
	
	@JsonProperty("Procedencia")
	public String procedencia;
	
	@JsonProperty("EixosQtd")
	public String eixosQtd;
	
	@JsonProperty("PBT")
	public String pBT;
	
	@JsonProperty("CMT")
	public String cMT;
	
	@JsonProperty("Cilindradas")
	public String cilindradas;
	
	@JsonProperty("NumLugares")
	public String numLugares;
	
	@JsonProperty("CapacCarga")
	public String capacCarga;
	
	@JsonProperty("NumCaixaCambio")
	public String numCaixaCambio;
	
	@JsonProperty("NumEixoTras")
	public String numEixoTras;
	
	@JsonProperty("NumEixoAux")
	public String numEixoAux;
	
	@JsonProperty("NumMotor")
	public String numMotor;
	
	@JsonProperty("relatedFipe")
	public String relatedFipe;
	
	@JsonProperty("config")
	public Config config;
	
	@JsonProperty("complemento")
	public List<Complemento> complemento = new LinkedList<>();

	public Authorize getAuthorize() {
		return authorize;
	}

	public void setAuthorize(Authorize authorize) {
		this.authorize = authorize;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}

	public String getAnoMod() {
		return anoMod;
	}

	public void setAnoMod(String anoMod) {
		this.anoMod = anoMod;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getSubsegmento() {
		return subsegmento;
	}

	public void setSubsegmento(String subsegmento) {
		this.subsegmento = subsegmento;
	}

	public String getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getEixosQtd() {
		return eixosQtd;
	}

	public void setEixosQtd(String eixosQtd) {
		this.eixosQtd = eixosQtd;
	}

	public String getpBT() {
		return pBT;
	}

	public void setpBT(String pBT) {
		this.pBT = pBT;
	}

	public String getcMT() {
		return cMT;
	}

	public void setcMT(String cMT) {
		this.cMT = cMT;
	}

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getNumLugares() {
		return numLugares;
	}

	public void setNumLugares(String numLugares) {
		this.numLugares = numLugares;
	}

	public String getCapacCarga() {
		return capacCarga;
	}

	public void setCapacCarga(String capacCarga) {
		this.capacCarga = capacCarga;
	}

	public String getNumCaixaCambio() {
		return numCaixaCambio;
	}

	public void setNumCaixaCambio(String numCaixaCambio) {
		this.numCaixaCambio = numCaixaCambio;
	}

	public String getNumEixoTras() {
		return numEixoTras;
	}

	public void setNumEixoTras(String numEixoTras) {
		this.numEixoTras = numEixoTras;
	}

	public String getNumEixoAux() {
		return numEixoAux;
	}

	public void setNumEixoAux(String numEixoAux) {
		this.numEixoAux = numEixoAux;
	}

	public String getNumMotor() {
		return numMotor;
	}

	public void setNumMotor(String numMotor) {
		this.numMotor = numMotor;
	}

	public String getRelatedFipe() {
		return relatedFipe;
	}

	public void setRelatedFipe(String relatedFipe) {
		this.relatedFipe = relatedFipe;
	}

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

//	public List<Complemento> getComplemento() {
//		return complemento;
//	}
//
//	public void setComplemento(List<Complemento> complemento) {
//		this.complemento = complemento;
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuivModel [");
		if (authorize != null)
			builder.append("authorize=").append(authorize).append(", ");
		if (placa != null)
			builder.append("placa=").append(placa).append(", ");
		if (marca != null)
			builder.append("marca=").append(marca).append(", ");
		if (modelo != null)
			builder.append("modelo=").append(modelo).append(", ");
		if (versao != null)
			builder.append("versao=").append(versao).append(", ");
		if (motorizacao != null)
			builder.append("motorizacao=").append(motorizacao).append(", ");
		if (chassis != null)
			builder.append("chassis=").append(chassis).append(", ");
		if (anoFab != null)
			builder.append("anoFab=").append(anoFab).append(", ");
		if (anoMod != null)
			builder.append("anoMod=").append(anoMod).append(", ");
		if (combustivel != null)
			builder.append("combustivel=").append(combustivel).append(", ");
		if (segmento != null)
			builder.append("segmento=").append(segmento).append(", ");
		if (subsegmento != null)
			builder.append("subsegmento=").append(subsegmento).append(", ");
		if (carroceria != null)
			builder.append("carroceria=").append(carroceria).append(", ");
		if (potencia != null)
			builder.append("potencia=").append(potencia).append(", ");
		if (procedencia != null)
			builder.append("procedencia=").append(procedencia).append(", ");
		if (eixosQtd != null)
			builder.append("eixosQtd=").append(eixosQtd).append(", ");
		if (pBT != null)
			builder.append("pBT=").append(pBT).append(", ");
		if (cMT != null)
			builder.append("cMT=").append(cMT).append(", ");
		if (cilindradas != null)
			builder.append("cilindradas=").append(cilindradas).append(", ");
		if (numLugares != null)
			builder.append("numLugares=").append(numLugares).append(", ");
		if (capacCarga != null)
			builder.append("capacCarga=").append(capacCarga).append(", ");
		if (numCaixaCambio != null)
			builder.append("numCaixaCambio=").append(numCaixaCambio).append(", ");
		if (numEixoTras != null)
			builder.append("numEixoTras=").append(numEixoTras).append(", ");
		if (numEixoAux != null)
			builder.append("numEixoAux=").append(numEixoAux).append(", ");
		if (numMotor != null)
			builder.append("numMotor=").append(numMotor).append(", ");
		if (relatedFipe != null)
			builder.append("relatedFipe=").append(relatedFipe).append(", ");
		if (config != null)
			builder.append("config=").append(config).append(", ");
		if (complemento != null)
			builder.append("complemento=").append(complemento);
		builder.append("]");
		return builder.toString();
	}

	

}
