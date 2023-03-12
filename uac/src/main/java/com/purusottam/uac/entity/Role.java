package com.purusottam.uac.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.purusottam.common.entity.BaseEntity;

import lombok.Data;

@Data
@Entity
@Table(name = "role")
//@JsonIgnoreProperties(value = { "roleDescription"}, allowGetters = true)
public class Role extends BaseEntity {

	private static final long serialVersionUID = 1599252334040983060L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="role_name")
	private String roleName;
	
	
	@Column(name="role_description")
	private String roleDescription;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	
	
	
	
}
//@Entity
//public class TableWithLongId extends BaseEntity<Long> {
//
//    // fields, constructors, methods etc
//}
