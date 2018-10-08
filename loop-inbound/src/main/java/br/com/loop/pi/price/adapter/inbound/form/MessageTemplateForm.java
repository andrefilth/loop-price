package br.com.loop.pi.price.adapter.inbound.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageTemplateForm {

	private String id;
	private String title;
	private String description;
	private String color;
	private String messageContent;
	private boolean status;
	private boolean giveNotice;
	private Date creationDate;
	private Date updateDate;
	private String serviceSituation;
	private String recipent;
	private ServiceCategoryForm serviceCategory;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isGiveNotice() {
		return giveNotice;
	}

	public void setGiveNotice(boolean giveNotice) {
		this.giveNotice = giveNotice;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getServiceSituation() {
		return serviceSituation;
	}

	public void setServiceSituation(String serviceSituation) {
		this.serviceSituation = serviceSituation;
	}

	public String getRecipent() {
		return recipent;
	}

	public void setRecipent(String recipent) {
		this.recipent = recipent;
	}

	public ServiceCategoryForm getServiceCategory() {
		return serviceCategory;
	}

	public void setServiceCategory(ServiceCategoryForm serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

}
