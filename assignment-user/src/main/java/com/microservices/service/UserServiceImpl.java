package com.microservices.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.model.User;

@Service

public class UserServiceImpl implements UserService {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public User getUserDetails(int userId) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(User.class, userId);
	}

}
