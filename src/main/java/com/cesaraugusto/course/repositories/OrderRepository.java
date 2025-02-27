package com.cesaraugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesaraugusto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
