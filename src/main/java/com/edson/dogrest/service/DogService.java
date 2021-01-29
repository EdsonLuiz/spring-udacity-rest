package com.edson.dogrest.service;

import java.util.List;

import com.edson.dogrest.entity.Dog;

public interface DogService {
    List<Dog> retrieveDogs();

	List<String> retrieveDogBreed();

	String retrieveDogBreedById(Long id);
}
