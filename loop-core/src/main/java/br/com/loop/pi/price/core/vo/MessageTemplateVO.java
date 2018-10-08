//package br.com.loop.pi.price.core.vo;
//
//import org.hibernate.validator.constraints.NotEmpty;
//
//import javax.validation.constraints.NotNull;
//import java.util.Date;
//
//public class MessageTemplateVO {
//
//	private String id;
//
//	@NotEmpty(message = "O título é obrigatório")
//	private String title;
//
//	@NotEmpty(message = "O descrição é obrigatória")
//	private String description;
//
//	@NotEmpty(message = "O cor é obrigatória")
//	private String color;
//
//	@NotNull(message = "O status é obrigatório")
//	private Boolean status;
//
//	@NotEmpty(message = "O situação de serviço é obrigatória")
//	private String serviceSituation;
//
//	@NotNull(message = "A categoria é obrigatória")
//	private String serviceCategoryName;
//
//	private ServiceCategoryVO serviceCategory;
//
//	private String recipent;
//	private Boolean giveNotice;
//	private Date creationDate;
//	private Date updateDate;
//	private String messageContent;
//
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public String getMessageContent() {
//		return messageContent;
//	}
//
//	public void setMessageContent(String messageContent) {
//		this.messageContent = messageContent;
//	}
//
//	public Boolean getStatus() {
//		return status;
//	}
//
//	public void setStatus(Boolean status) {
//		this.status = status;
//	}
//
//	public Boolean getGiveNotice() {
//		return giveNotice;
//	}
//
//	public void setGiveNotice(Boolean giveNotice) {
//		this.giveNotice = giveNotice;
//	}
//
//	public Date getCreationDate() {
//		return creationDate;
//	}
//
//	public void setCreationDate(Date creationDate) {
//		this.creationDate = creationDate;
//	}
//
//	public Date getUpdateDate() {
//		return updateDate;
//	}
//
//	public void setUpdateDate(Date updateDate) {
//		this.updateDate = updateDate;
//	}
//
//	public String getServiceSituation() {
//		return serviceSituation;
//	}
//
//	public void setServiceSituation(String serviceSituation) {
//		this.serviceSituation = serviceSituation;
//	}
//
//	public String getRecipent() {
//		return recipent;
//	}
//
//	public void setRecipent(String recipent) {
//		this.recipent = recipent;
//	}
//
//	public ServiceCategoryVO getServiceCategory() {
//		return serviceCategory;
//	}
//
//	public void setServiceCategory(ServiceCategoryVO serviceCategory) {
//		this.serviceCategory = serviceCategory;
//	}
//
//	public String getServiceCategoryName() {
//		return serviceCategoryName;
//	}
//
//	public void setServiceCategoryName(String serviceCategoryName) {
//		this.serviceCategoryName = serviceCategoryName;
//	}
//}
