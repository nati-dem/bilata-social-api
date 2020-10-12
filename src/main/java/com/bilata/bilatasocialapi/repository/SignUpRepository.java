package com.bilata.bilatasocialapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bilata.bilatasocialapi.model.User;

@Repository
public interface  SignUpRepository extends JpaRepository<User, Long> {
	
 
	}
