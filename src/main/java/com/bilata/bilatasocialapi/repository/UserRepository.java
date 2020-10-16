package com.bilata.bilatasocialapi.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bilata.bilatasocialapi.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	User findByUsername(String username);

	@Query("SELECT c FROM clients c WHERE c.company_name = :company_name")
	public List<User> companyName(@Param("company_name") String company_name);
	@Query
	List<User> findByUserId(@Param(value = "userId") int id);
}