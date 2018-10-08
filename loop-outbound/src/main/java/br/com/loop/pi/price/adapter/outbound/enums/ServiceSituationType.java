package br.com.loop.pi.price.adapter.outbound.enums;

public enum ServiceSituationType {

	ACCEPTED(1L, "Aceito", "00001"),
    RECUSED(2L, "Negado", "00002"),
	DISABLE(3L,"Desativado","00003");

	private Long code;
	private String name;
	private String codeRA;

	ServiceSituationType(Long code, String name, String codeRA) {
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

}


