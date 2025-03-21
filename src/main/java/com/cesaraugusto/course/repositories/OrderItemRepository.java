package com.cesaraugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesaraugusto.course.entities.OrderItem;
import com.cesaraugusto.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
