package br.com.loop.pi.price.adapter.outbound.vo;

public class Endereco {
	
	private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	@Override
	public String toString() {
		return "Endereco [" + (cep != null ? "cep=" + cep + ", " : "")
				+ (logradouro != null ? "logradouro=" + logradouro + ", " : "")
				+ (complemento != null ? "complemento=" + complemento + ", " : "")
				+ (bairro != null ? "bairro=" + bairro + ", " : "")
				+ (localidade != null ? "localidade=" + localidade + ", " : "") + (uf != null ? "uf=" + uf : "") + "]";
	}
    
    

}
