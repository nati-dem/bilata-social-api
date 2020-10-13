package com.bilata.bilatasocialapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.bilata.bilatasocialapi.model.User;
import com.bilata.bilatasocialapi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User getUserByUserName(String name) {
		return userRepository.findByUsername(name);
	}

	public List<User> findByUsername(String username) {

		return (List<User>) userRepository.findByUsername(username);
	}

}
