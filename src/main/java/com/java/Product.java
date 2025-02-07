package com.java;

public class Product {

	private int id;
	
	private String name;
	
	private double price;
	
	private String catagory;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", catagory=" + catagory + "]";
	}

	public Product(int id, String name, double price, String catagory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.catagory = catagory;
	}
	
	
}
