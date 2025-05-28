package com.ecommerce.shopcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.shopcart.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
