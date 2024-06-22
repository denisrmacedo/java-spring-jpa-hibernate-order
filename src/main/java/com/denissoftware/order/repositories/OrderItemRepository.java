package com.denissoftware.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denissoftware.order.entities.OrderItem;
//
//public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
//
//}
import com.denissoftware.order.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
