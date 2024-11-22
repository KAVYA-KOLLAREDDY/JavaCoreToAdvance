package com.teamproject.hateoaseaxample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Roles{
	@Id
	private int id;
	private String rolename;
	
	@OneToOne
	@JoinColumn(name="user_id", referencedColumnName="id")
	private User user;

	public Roles(String rolename) {
		super();
		this.rolename = rolename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Roles [id=" + id + ", rolename=" + rolename + ", user=" + user + "]";
	}
	
	
}