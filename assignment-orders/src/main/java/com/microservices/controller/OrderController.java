package com.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.model.Order;
import com.microservices.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders/{userId}")
	public List<Order> getOrders(@PathVariable int userId){
		return orderService.getOrders(userId);
	}
	
}
