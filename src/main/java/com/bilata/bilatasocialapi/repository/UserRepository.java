package com.bilata.bilatasocialapi.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bilata.bilatasocialapi.model.User;
public interface UserRepository extends CrudRepository<User, Integer> {
	List findByUsername(String username);
}