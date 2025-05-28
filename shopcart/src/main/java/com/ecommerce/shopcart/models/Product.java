package com.ecommerce.shopcart.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getNumofReviews() {
		return numofReviews;
	}
	public void setNumofReviews(int numofReviews) {
		this.numofReviews = numofReviews;
	}
	
	public Product(String name, double price, String description, double ratings, String category, String seller,
			int stock, int numofReviews, List<String> list) {
		super();
		this.name = name;
		this.price = price;
		Description = description;
		this.ratings = ratings;
		this.category = category;
		this.seller = seller;
		this.stock = stock;
		this.numofReviews = numofReviews;
	}
	public Product() {
		super();
	}
	
	private String name;
	private double price;
	private String Description;
	private double ratings;
	private String category;
	private String seller;
	private int stock;
	private int numofReviews;
	private List<String> images;



	

}
