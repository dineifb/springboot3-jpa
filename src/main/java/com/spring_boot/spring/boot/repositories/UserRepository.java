package com.spring_boot.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot.spring.boot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
