package com.soumya.spring_security.model;

import javax.persistence.*;

@Entity
@Table(name = "users_jpa")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private String roles;
	private boolean active;
	
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="password")
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	@Column(name="active")
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
