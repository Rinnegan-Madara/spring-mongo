package com.example.restapplication;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "todo", path = "todo")
public interface TodoRepository extends MongoRepository<Todo, String> {
    List<Todo> findByTitle(@Param("title") String title);
}