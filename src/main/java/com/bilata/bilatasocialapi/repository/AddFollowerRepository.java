package com.bilata.bilatasocialapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bilata.bilatasocialapi.model.Follower;

public interface AddFollowerRepository extends JpaRepository<Follower, Integer> {
	
	@Query("SELECT e FROM followers e WHERE e.user_id = :userId AND e.target_user_id = :target_user_id")
	public Follower checkIfAlreadyFollowing(@Param("userId") Integer userId,@Param("target_user_id") Integer target_user_id);

}
