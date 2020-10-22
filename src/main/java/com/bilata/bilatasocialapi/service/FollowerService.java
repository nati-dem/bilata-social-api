package com.bilata.bilatasocialapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilata.bilatasocialapi.model.Follower;
import com.bilata.bilatasocialapi.model.User;
import com.bilata.bilatasocialapi.repository.AddFollowerRepository;
import com.bilata.bilatasocialapi.repository.FollowerRepository;

@Service
public class FollowerService {
	
	@Autowired
	FollowerRepository followerRepository;
	@Autowired
	AddFollowerRepository addFollower;

	public List<User> displayByUserId(Integer userId) {
		return followerRepository.findFollowers(userId);
	}
	public boolean followUser(Follower follower) {
		boolean userAlreadyFollowing;
		if (addFollower.checkIfAlreadyFollowing(follower.getUserId(), follower.getTarget_user_id())== null) {
			addFollower.save(follower);
			userAlreadyFollowing=false;
		}
		else {
			userAlreadyFollowing=true;
		}
		return userAlreadyFollowing;
	}

}
