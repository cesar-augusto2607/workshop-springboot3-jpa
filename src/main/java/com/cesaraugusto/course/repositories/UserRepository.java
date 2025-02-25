package com.cesaraugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesaraugusto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
