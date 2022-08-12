package com.example.demo.entities;

import java.io.Serializable;

public class Product implements Serializable {
	
	private long id;
	private String name;
	private double price;
	
	private Category category;

	public Product() {
		
	}
	
	public Product(long id, String name, double price, Category category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
