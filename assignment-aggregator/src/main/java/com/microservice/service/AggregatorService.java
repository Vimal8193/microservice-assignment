package com.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dto.AggregatorResponse;
import com.microservice.dto.OrderResponse;
import com.microservice.dto.UserResponse;

@Service
public class AggregatorService {

	@Autowired
	AggregatorUserService userService;

	
	public AggregatorResponse getOrderDetails(int id) {
		
		UserResponse user = userService.getUserDetails(id);
		List<OrderResponse> orders = userService.getOrders(id);
		return new AggregatorResponse(user,orders);
	}
}
