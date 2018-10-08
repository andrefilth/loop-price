package br.com.loop.pi.price.adapter.outbound.entity;
//package br.com.reclameaqui.pi.mt.adapter.outbound.entity;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.index.Indexed;
//import org.springframework.data.mongodb.core.index.TextIndexed;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import br.com.reclameaqui.pi.mt.adapter.outbound.enums.RecipentType;
//import br.com.reclameaqui.pi.mt.adapter.outbound.enums.ServiceSituationType;
//
//@JsonIgnoreProperties(ignoreUnknown = true)
//@Document(collection = "ra-message-template")
//public class MessageTemplateEntity {
//
//	@Id
//	private String id;
//
//	@TextIndexed(weight=4)
//	@Indexed(unique = true)
//	private String title;
//
//	@TextIndexed(weight=5)
//	@Indexed(unique = true)
//	private String messageContent;
//
//	@TextIndexed(weight=4)
//	private String description;
//
//	private String color;
//	private Boolean status;
//	private Boolean giveNotice;
//	private ServiceSituationType serviceSituationType;
//	private RecipentType recipentType;
//	private ServiceCategory serviceCategory;
//	private String serviceCategoryName;
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
//	public ServiceSituationType getServiceSituationType() {
//		return serviceSituationType;
//	}
//
//	public void setServiceSituationType(ServiceSituationType serviceSituationType) {
//		this.serviceSituationType = serviceSituationType;
//	}
//
//	public RecipentType getRecipentType() {
//		return recipentType;
//	}
//
//	public void setRecipentType(RecipentType recipentType) {
//		this.recipentType = recipentType;
//	}
//
//	public ServiceCategory getServiceCategory() {
//		return serviceCategory;
//	}
//
//	public void setServiceCategory(ServiceCategory serviceCategory) {
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
