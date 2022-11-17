package net.guides.springboot.crud.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import net.guides.springboot.crud.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{
	
	@Query("{'firstName':?0}")
	List<Employee> findByFirstname(String firstName);
	
	@Query("{'lastName':?0}")
	List<Employee> findByLastname(String lastName);
	
	@Query("{'firstName':?0 ,'lastName': ?1}")
	List<Employee> findByFirstnameAndLastname(String firstName, String lastName);
	
	List<Employee> findByFirstNameStartingWith(String firstName);		
	
}
