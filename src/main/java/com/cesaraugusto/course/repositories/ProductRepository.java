package com.cesaraugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesaraugusto.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
