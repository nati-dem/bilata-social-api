package com.bilata.bilatasocialapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bilata.bilatasocialapi.model.User;

@Repository
public interface  SignUpRepository extends CrudRepository<User, Integer> {
	
 
	}
