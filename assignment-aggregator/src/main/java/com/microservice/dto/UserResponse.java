package com.microservice.dto;

public class UserResponse {


	private int userId;

	private String name;

	private int age;

	private String email;

	public UserResponse(int userId, String name, int age, String email) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
