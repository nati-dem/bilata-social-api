package com.bilata.bilatasocialapi.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bilata.bilatasocialapi.model.Follower;
import com.bilata.bilatasocialapi.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	User findByUsername(String username);

	//@Query("select * FROM users u JOIN clients c ON u.id = c.user_id WHERE c.company_name = :company_name")
	//public List<User> companyName(@Param("company_name") String company_name);
	
	List<User> findById(int userId);
}