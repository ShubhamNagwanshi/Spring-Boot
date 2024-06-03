package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;

public class LoginForm extends BaseForm{

	@NotEmpty(message = "Login id is required")
	private String login;

	@NotEmpty(message = "Password is required")
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
