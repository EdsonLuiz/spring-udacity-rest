package com.edson.dogrest.repository;

import com.edson.dogrest.entity.Dog;

import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
    
}
