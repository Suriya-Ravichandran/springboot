package com.example.EcommerceAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EcommerceAPI.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
