package com.example.demo;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Register;

@RepositoryRestResource(collectionResourceRel = "Register", path = "register")
public interface RegisterRepository extends PagingAndSortingRepository<Register, Integer> {

	public void findByEmail(String email);
	
	
	@Query("SELECT r from Register r where r.active>= :active")
	public List<Register> findactive(@Param("active") int active);



}
