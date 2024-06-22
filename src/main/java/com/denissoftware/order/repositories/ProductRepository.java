package com.denissoftware.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denissoftware.order.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}