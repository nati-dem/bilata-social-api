package com.bilata.bilatasocialapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilata.bilatasocialapi.model.SignUpRequest;
import com.bilata.bilatasocialapi.model.User;
import com.bilata.bilatasocialapi.repository.SignUpRepository;

@Service
public class SignUpService {

	@Autowired
	SignUpRepository signUpRepository;

	public User creatUser(User user) {
		return signUpRepository.save(user);
			// TODO Auto-generated method stub
			
		}
}
