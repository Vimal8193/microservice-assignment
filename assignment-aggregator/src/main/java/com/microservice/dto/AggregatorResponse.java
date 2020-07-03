package com.microservice.dto;

import java.util.List;

public class AggregatorResponse {

	private UserResponse user;
	private List<OrderResponse> orders;
	
	public AggregatorResponse(UserResponse user, List<OrderResponse> orders) {
		super();
		this.user = user;
		this.orders = orders;
	}
	
	public UserResponse getUser() {
		return user;
	}
	public void setUser(UserResponse user) {
		this.user = user;
	}
	public List<OrderResponse> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderResponse> orders) {
		this.orders = orders;
	}
	
	
}
