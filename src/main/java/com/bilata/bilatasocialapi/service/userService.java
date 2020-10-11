package com.bilata.bilatasocialapi.service;

import com.bilata.bilatasocialapi.model.User;
import com.bilata.bilatasocialapi.repository.UserRepository;

public class userService {

	public static User getUserByUserName(String name) {
		return UserRepository.findByUsername(name);
	}
	

}
