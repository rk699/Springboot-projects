package com.purusottam.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

//@Getter
//@Setter
//@MappedSuperclass
//public abstract class BaseEntity<T> implements Serializable {
//
//    protected T id;
//
//    // fields, constructors, methods etc
//}

@Data
@MappedSuperclass
//@JsonIgnoreProperties(value = { "createdDate", "lastUpdatedDate" }, allowGetters = true)
public abstract class BaseEntity implements Serializable {


	private static final long serialVersionUID = -3633496432560247899L;
	@Column(nullable = false)
	private String createdBy;
	
	@Column(updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
    private Date createdDate;
	
	@Column(nullable = false)
    private String lastUpdatedBy;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date lastUpdatedDate;
    
    public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name="ROLE_ACTIVE",nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isActive;

    @Override
    public String toString() {
        return String.format(
                "BaseEntity [createdBy=%s, createdDate=%s, lastUpdatedBy=%s, lastUpdatedDate=%s, isActive=%s]",
                createdBy, createdDate, lastUpdatedBy, lastUpdatedDate, isActive);
    }
}
