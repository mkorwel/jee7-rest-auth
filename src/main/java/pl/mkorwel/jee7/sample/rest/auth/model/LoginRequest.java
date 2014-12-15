package pl.mkorwel.jee7.sample.rest.auth.model;

import java.io.Serializable;

public class LoginRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String login;

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
