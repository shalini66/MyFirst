package com.capgemini.spring.dao;

import org.springframework.stereotype.Service;

import com.capgemini.spring.dto.UserBean;
@Service
public interface UserDAO {
	boolean register(UserBean info);

	UserBean login(String email, String password);

}
