package br.com.loop.pi.price.core.client.dto;

import java.util.LinkedList;
import java.util.List;

public class SuivDTO {

	private AuthorizeDTO authorize;
	
	private String placa;
	
	private String marca;
	
	private String modelo;
	
	private String versao;
	
	private String motorizacao;
	
	private String chassis;
	
	private String anoFab;
	
	private String anoMod;
	
	private String combustivel;
	
	private String segmento;
	
	private String subsegmento;
	
	private String carroceria;
	
	private String potencia;
	
	private String procedencia;
	
	private String eixosQtd;
	
	private String pBT;
	
	private String cMT;
	
	private String cilindradas;
	
	private String numLugares;
	
	private String capacCarga;
	
	private String numCaixaCambio;
	
	private String numEixoTras;
	
	private String numEixoAux;
	
	private String numMotor;
	
	private String relatedFipe;
	
	private ConfigDTO configDTO;
	
	private List<ComplementoDTO> complementoDTO = new LinkedList<>();

	public AuthorizeDTO getAuthorize() {
		return authorize;
	}

	public void setAuthorize(AuthorizeDTO authorize) {
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

	public ConfigDTO getConfigDTO() {
		return configDTO;
	}

	public void setConfigDTO(ConfigDTO configDTO) {
		this.configDTO = configDTO;
	}

	public List<ComplementoDTO> getComplementoDTO() {
		return complementoDTO;
	}
	
	public void setComplementoDTO(List<ComplementoDTO> complementoDTO) {
		this.complementoDTO = complementoDTO;
	}
	
	
}
