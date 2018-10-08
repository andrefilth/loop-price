//package br.com.loop.pi.price.adapter.outbound.auditing;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.annotation.Version;
//
///**
// * Created by IntelliJ IDEA.
// *
// * @author Eli Gomes on 01/05/18
// * @project ra-message-template
// * @time 12:34
// */
//
//public abstract class AuditingEntity implements Serializable {
//
//	private static final long serialVersionUID = 7050557015605844527L;
//
//	@CreatedDate
//	private Date createdDate;
//	@CreatedBy
//	private String createdBy;
//	@LastModifiedDate
//	private Date updatedDate;
//	@LastModifiedBy
//	private String updatedBy;
//	@Version
//	private Long version;
//
//	public Date getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public String getCreatedBy() {
//		return createdBy;
//	}
//
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//
//	public Date getUpdatedDate() {
//		return updatedDate;
//	}
//
//	public void setUpdatedDate(Date updatedDate) {
//		this.updatedDate = updatedDate;
//	}
//
//	public String getUpdatedBy() {
//		return updatedBy;
//	}
//
//	public void setUpdatedBy(String updatedBy) {
//		this.updatedBy = updatedBy;
//	}
//
//	public Long getVersion() {
//		return version;
//	}
//
//	public void setVersion(Long version) {
//		this.version = version;
//	}
//
//}
