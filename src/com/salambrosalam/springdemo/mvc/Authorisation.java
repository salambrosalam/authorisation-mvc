package com.salambrosalam.springdemo.mvc;

import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.lang.NonNull;
import org.springframework.test.annotation.IfProfileValue;


public class Authorisation {
	
	@NotNull(message="is required")
	@Pattern(regexp = "^(.+)@(.+)$" , message = "enter valid email")
	private String login;
	
	
	@NotNull(message = "is required")
	@Size(min=5, message="min 5 symbols")
	private String password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
			
	
	

}