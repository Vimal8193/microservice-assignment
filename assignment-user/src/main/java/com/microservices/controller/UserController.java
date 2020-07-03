package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.model.User;
import com.microservices.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{userId}")
	public User getUserDetails(@PathVariable int userId) {
		//return userService.getUserDetails(userId);
		return new User("Adam", 26, "gally@gmail.com");
	}
}
