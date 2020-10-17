package com.bilata.bilatasocialapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bilata.bilatasocialapi.model.Follower;

@Repository
public interface FollowerRepository extends CrudRepository<Follower, Integer>{

	@Query
	List<Follower> findByUserId(@Param(value = "userId") String userId);
		
}
