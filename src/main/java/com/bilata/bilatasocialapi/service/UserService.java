package com.bilata.bilatasocialapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

//	
//	public List<User> displayByUserId(int id) {
//		return (List<User>) userRepository.findByUserId(id);
//	}

	public List<User> findByCompanyName(String company_name) {

		List<User> companyList = userRepository.companyName(company_name);

		return companyList;
	}

}
