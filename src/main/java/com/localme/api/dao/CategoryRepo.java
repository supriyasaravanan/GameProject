package com.localme.api.dao;


import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.localme.api.vo.Category;


@RepositoryRestResource
public interface CategoryRepo extends CrudRepository<Category, String>{
	public Category findByname(String name);
	Optional<Category> findByName(String name);
	
}
