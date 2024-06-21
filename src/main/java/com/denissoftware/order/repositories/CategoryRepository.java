package com.denissoftware.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denissoftware.order.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
