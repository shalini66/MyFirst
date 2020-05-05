package com.capgemini.spring.service;

import com.capgemini.spring.dto.UserBean;

public interface UserService {
	boolean register(UserBean info);

	UserBean login(String email, String password);
}
