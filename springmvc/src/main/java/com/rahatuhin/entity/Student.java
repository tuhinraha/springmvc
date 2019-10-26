package com.rahatuhin.entity;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotEmpty;

public class Student {

	@NotEmpty(message = "FirstName Cannot Be Empty")
	private String firstName;
	
	@NotEmpty(message = "Lastname Cannot Be Empty")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
