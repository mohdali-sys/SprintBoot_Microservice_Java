package com.example.demo.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.product.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
