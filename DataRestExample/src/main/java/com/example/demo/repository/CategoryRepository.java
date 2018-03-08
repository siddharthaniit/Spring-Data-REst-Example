package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Supplier;

@RepositoryRestResource(collectionResourceRel = "Register", path = "supplier")
public interface CategoryRepository extends PagingAndSortingRepository<Supplier, Integer>{

}
