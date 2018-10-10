package br.com.loop.pi.price.core.client.dto;

import java.io.Serializable;

public class DesempenhoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String velocidadeMaxima;

	public String getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(String velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	

}
