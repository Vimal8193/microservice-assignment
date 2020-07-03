package com.microservices.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.model.Order;

@Service
public class OrderService {
	
	public List<Order> getOrders(int userId){
		
		List<Order> myOrders = new ArrayList<Order>();
		
		myOrders.add(new Order(1,250, LocalDate.of(2020, 03, 12)));
		myOrders.add(new Order(2,550, LocalDate.of(2020, 04, 12)));
		myOrders.add(new Order(3,440, LocalDate.of(2020, 05, 12)));
		
		return myOrders;
	}

}
