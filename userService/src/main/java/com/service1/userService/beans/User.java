package com.service1.userService.beans;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class User {

	@Id
	Integer userId;
	String userName;
	String userAddr;
	@Transient // using transient will not create Contacts as a field in the database
	List<Contacts> contacts;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String userName, String userAddr) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddr = userAddr;
	}

	public User(Integer userId, String userName, String userAddr, List<Contacts> contacts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddr = userAddr;
		this.contacts = contacts;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public List<Contacts> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}

}
