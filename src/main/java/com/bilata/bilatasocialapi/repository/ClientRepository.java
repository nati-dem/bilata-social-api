package com.bilata.bilatasocialapi.repository;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bilata.bilatasocialapi.model.Client;
import com.bilata.bilatasocialapi.model.User;

@Repository
public class ClientRepository { //  extends CrudRepository<Client, Integer>
	
	@PersistenceContext
	private EntityManager entityManager;

	//@Query("from clients c JOIN users u ON u.id = c.user_id WHERE c.company_name = :companyName")
	//public List<User> findBycompanyName(@Param("companyName") String companyName);
	
	public List<User> findBycompanyName(String companyName){
	      javax.persistence.Query query = entityManager.
	      createQuery("select * from clients c JOIN users u ON u.id = c.user_id WHERE c.company_name = 'test'");
	      List<String> list = query.getResultList();

	      for(String e:list) {
	         System.out.println("Employee NAME :"+e);
	      }
		return null;
	}
	
}
