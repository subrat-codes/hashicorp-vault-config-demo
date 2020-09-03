package com.example.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("")
public class AppCredentials {
	private String userName;
	private String password;

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
