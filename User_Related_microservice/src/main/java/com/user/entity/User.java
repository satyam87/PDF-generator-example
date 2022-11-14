package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private long userId;
	private String name;
	private String phone;
	
	List<Contact> contact=new ArrayList<>();

	public User(long userId, String name, String phone, List<com.user.entity.Contact> contact) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
//		this.contact = contact;
	}
	public User() {
		
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Contact> getContact() {
		return contact;
	}
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	
	
	
}
