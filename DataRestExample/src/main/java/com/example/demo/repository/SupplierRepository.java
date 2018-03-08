package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Categories;

@RepositoryRestResource(collectionResourceRel = "Register", path = "category")
public interface SupplierRepository extends PagingAndSortingRepository<Categories, Integer>{
	

}
