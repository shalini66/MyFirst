package com.capgemini.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.spring.dao.UserDAO;
import com.capgemini.spring.dto.UserBean;
@Service
public class UserServiceImp implements UserService{
	@Autowired UserDAO dao;
	
	public boolean register(UserBean info) {
		
		return dao.register(info);
	}

	public UserBean login(String email, String password) {
		
		return dao.login(email, password);
	}

}
