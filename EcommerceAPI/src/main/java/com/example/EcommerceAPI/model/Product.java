package com.example.EcommerceAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String product;
	private String Description;
	private String price;
	private int quantity;
	private float rateing;
	
	public Product(Long id, String product, String description, String price, int quantity, float rateing) {
		super();
		this.id = id;
		this.product = product;
		Description = description;
		this.price = price;
		this.quantity = quantity;
		this.rateing = rateing;
	}

	public Product() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getRateing() {
		return rateing;
	}

	public void setRateing(float rateing) {
		this.rateing = rateing;
	}
	
	
	
	
}
