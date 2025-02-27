package com.cesaraugusto.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesaraugusto.course.entities.Category;
import com.cesaraugusto.course.repositories.CategoryRepository;

@Service
public class CategoryService {

		@Autowired
		private CategoryRepository repository;
		
		public List<Category> findAll(){
			return repository.findAll();
		}
		
		public Category findById(Long id) {
			Optional <Category>obj  = repository.findById(id);
			return obj.get();
		}
		
}
