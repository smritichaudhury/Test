package com.springboot.prac.web.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springboot.prac.web.dto.UserRegistrationDto;
import com.springboot.prac.web.model.User;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
	//will save user registered dat
}
