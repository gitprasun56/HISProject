package com.prasun.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "Admin_Entity")
@Data
public class AdminEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "Admin_ID")
	private Integer adminId;
	@Column(name = "First_NAME")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "Email")
	private String email;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Role")
	private String role;
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createDt;

	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updateDt;

}
