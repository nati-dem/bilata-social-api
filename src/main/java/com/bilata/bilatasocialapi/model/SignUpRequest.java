package com.bilata.bilatasocialapi.model;

import java.util.Set;

public class SignUpRequest {

	private long id;
	private String username;
	private String password;
	private String passwordConfirm;
	private Set roles; // roles is company type 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
//	@ManyToMany
//	@JoinTable(name = "user_role", 
//	joinColumns = @JoinColumn(name = "user_id"), 
//	inverseJoinColumns = @JoinColumn(name = "role_id"))
	
	public Set getRoles() {
		return roles;
	}
	public void setRoles(Set roles) {
		this.roles = roles;
	}
	
}
