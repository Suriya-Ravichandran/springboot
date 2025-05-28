package com.ecommerce.shopcart.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.shopcart.models.Product;
import com.ecommerce.shopcart.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
//	@GetMapping
//	public List<Map<String,Object>> getAllProducts() {
//		return Arrays.asList(
//				Map.of("Name","Product 1","price",234),
//				Map.of("Name","Product 2","price",123),
//				Map.of("Name","Product 3","price",134)
//				);
//		
//	}
	
	@GetMapping
	public List<Product> getAllProducts() {
		return productservice.getAllProducts();
		
	}
	
	@GetMapping("/category")
	public List<Map<String,Object>> getCategoryProducts() {
		return Arrays.asList(
				Map.of("Name","Product 1","price",234),
				Map.of("Name","Product 2","price",123),
				Map.of("Name","Product 3","price",134)
				);
		
	}

}
