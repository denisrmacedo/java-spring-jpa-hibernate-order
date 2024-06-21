package com.denissoftware.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denissoftware.order.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
