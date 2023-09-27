package com.spring_boot.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot.spring.boot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
