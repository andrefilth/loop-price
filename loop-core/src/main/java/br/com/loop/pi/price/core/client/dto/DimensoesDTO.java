package br.com.loop.pi.price.core.client.dto;

import java.io.Serializable;

public class DimensoesDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	

	private String portaMalas;
	
	private String tanqueDeCombustivel;
	
	private String peso;

	public String getPortaMalas() {
		return portaMalas;
	}

	public void setPortaMalas(String portaMalas) {
		this.portaMalas = portaMalas;
	}

	public String getTanqueDeCombustivel() {
		return tanqueDeCombustivel;
	}

	public void setTanqueDeCombustivel(String tanqueDeCombustivel) {
		this.tanqueDeCombustivel = tanqueDeCombustivel;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	
}
