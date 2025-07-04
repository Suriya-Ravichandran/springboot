package com.example.EcommerceAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcommerceAPI.Exception.ResourceNotFoundException;
import com.example.EcommerceAPI.model.Product;
import com.example.EcommerceAPI.repository.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productrepo;
	
	
	@GetMapping
	public List<Product> GetAllProduct() {
		return productrepo.findAll();
	}
	
	@PostMapping
	public Product AddProduct(@RequestBody Product product) {
		return productrepo.save(product);
	}
	
	@GetMapping("/{id}")
	public Product GetSingleProduct(@PathVariable Long id) {
		return productrepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product Not Found With this Id:"+id));
		
	}
	@PutMapping("/{id}")
	public Product Updateproduct(@RequestBody Product product,@PathVariable Long id) {
		Product productdata=productrepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product Not Found With this Id:"+id));
		productdata.setProduct(product.getProduct());
		productdata.setDescription(product.getDescription());
		productdata.setPrice(product.getPrice());
		productdata.setQuantity(product.getQuantity());
		productdata.setRateing(product.getRateing());
		return productrepo.save(productdata);
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteuser(@PathVariable Long id){
		Product productdata=productrepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Product Not Found With this Id:"+id));
		productrepo.delete(productdata);
		return ResponseEntity.ok().build();
		
	}
	
}
