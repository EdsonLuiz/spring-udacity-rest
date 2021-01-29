package com.edson.dogrest.repository;

import java.util.List;

import com.edson.dogrest.entity.Dog;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
    @Query("select d.id, d.breed from Dog d")
    List<String> findAllBreed();
}
