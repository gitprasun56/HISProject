package com.prasun.model;

import lombok.Data;

@Data
public class AdminModel {

	private Integer adminId;
	private String firstName;
	private String lastName;
	private String email;
	private Double gender;
	private String role;
}
