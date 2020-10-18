package com.bilata.bilatasocialapi.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bilata.bilatasocialapi.model.Follower;
import com.bilata.bilatasocialapi.model.User;

@Repository
public class FollowerRepository{ //  extends CrudRepository<Follower, Integer>

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<User> findFollowers(Integer userId){ //  INNER JOIN followers f ON u.id = f.user_id 

	      javax.persistence.Query query = entityManager.
	    		  createQuery("select f FROM followers f WHERE f.target_user_id = :userId ")
	    		  .setParameter("userId", userId);
	      List<Follower> list = (List<Follower>) query.getResultList();
	      
	      List<Integer> followerIds = new ArrayList<Integer>();
	      for(Follower e:list) {
	    	  followerIds.add(e.getUserId());
	      }

	      javax.persistence.Query query2 = entityManager.
	    		  createQuery("select u FROM users u WHERE u.id IN (:userIds) ")
	    		  .setParameter("userIds", followerIds);
	      
	      List<User> followers = (List<User>) query2.getResultList();

		return followers;
	}
	
}
