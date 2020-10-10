package com.bilata.bilatasocialapi.repository;
import org.springframework.data.repository.CrudRepository;

import com.bilata.bilatasocialapi.model.User;
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}