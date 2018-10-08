package br.com.loop.pi.price.adapter.outbound.enums;

public enum RecipentType {

	CONSUMER(1L, "Consumidor", "0001"),
	COMPANY(2L, "Empresa", "0002"),
	BOTH(3L, "Ambos", "0003");

	private Long code;
	private String name;
	private String codeRA;

	private RecipentType(Long code, String name, String codeRA) {
		this.code = code;
		this.name = name;
		this.codeRA = codeRA;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodeRA() {
		return codeRA;
	}

	public void setCodeRA(String codeRA) {
		this.codeRA = codeRA;
	}

	public static void main(String[] args) {

	}

}
