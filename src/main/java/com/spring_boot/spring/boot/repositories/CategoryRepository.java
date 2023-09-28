package com.spring_boot.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot.spring.boot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
