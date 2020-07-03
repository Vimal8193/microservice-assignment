package com.microservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID", unique = true, nullable = false)
	private int userId;
	
	@Column(name = "NAME", unique = false, nullable = true)
	private String name;
	
	@Column(name = "AGE", unique = false, nullable = true)
	private int age;
	
	@Column(name = "EMAIL", unique = false, nullable = true)
	private String email;
	
	public User() {
		super();
	}

	public User(String name, int age, String email) {
		super();
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
