package br.com.loop.pi.price.adapter.inbound.form;

public class ServiceCategoryForm {

	private String code;
	private String name;
	private Integer codeRA;
	
	public ServiceCategoryForm(String code, String name, Integer codeRA) {
		super();
		this.code = code;
		this.name = name;
		this.codeRA = codeRA;
	}
	
	public ServiceCategoryForm() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCodeRA() {
		return codeRA;
	}

	public void setCodeRA(Integer codeRA) {
		this.codeRA = codeRA;
	}
}
