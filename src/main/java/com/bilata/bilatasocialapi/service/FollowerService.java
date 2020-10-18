package com.bilata.bilatasocialapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilata.bilatasocialapi.model.Follower;
import com.bilata.bilatasocialapi.model.User;
import com.bilata.bilatasocialapi.repository.FollowerRepository;

@Service
public class FollowerService {
	
	@Autowired
	FollowerRepository followerRepository;

	public List<User> displayByUserId(Integer userId) {
		return followerRepository.findFollowers(userId);
	}

}
