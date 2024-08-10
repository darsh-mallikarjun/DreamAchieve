package com.dreamachieve.application.dao;

public class BuyerDao {
	private int id;
	private String name;
	private String email;
	private long contact;
	private String address;
	private String password;
	
	
	public BuyerDao(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BuyerDao(String name, String email, long contact, String address, String password) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.password = password;
	}
	
	
	
}