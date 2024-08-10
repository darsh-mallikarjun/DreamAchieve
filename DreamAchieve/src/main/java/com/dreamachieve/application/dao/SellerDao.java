package com.dreamachieve.application.dao;

public class SellerDao {

	private int id;
	private String name;
	private String email;
	private String contact;
	private String address;
	private String image;
	private double price;
	 private String plot_area;
	 private String dimensions;
	 
	 
	 public SellerDao(String name, String email, String contact, String address, String image, double price,
			String plot_area, String dimensions, String password) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.image = image;
		this.price = price;
		this.plot_area = plot_area;
		this.dimensions = dimensions;
		this.password = password;
	}
	private String password;

	 public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SellerDao(){
		 
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPlot_area() {
		return plot_area;
	}

	public void setPlot_area(String plot_area) {
		this.plot_area = plot_area;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
 

	
}
