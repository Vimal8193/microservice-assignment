package com.microservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.dto.OrderResponse;
import com.microservice.dto.UserResponse;

@FeignClient(name="netflix-zuul-api-gateway-server")

public interface AggregatorUserService {

	@GetMapping("/user-service//user/{userId}")
	public UserResponse getUserDetails(@PathVariable int userId);
	
	@GetMapping("/order-service/orders/{userId}")
	public List<OrderResponse> getOrders(@PathVariable int userId);
}
