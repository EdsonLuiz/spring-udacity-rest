package com.edson.dogrest.service;

import java.util.List;
import java.util.Optional;

import com.edson.dogrest.entity.Dog;
import com.edson.dogrest.repository.DogRepository;

import org.springframework.stereotype.Service;

@Service
public class DogServiceImpl implements DogService {

    private DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    @Override
    public String retrieveDogBreedById(Long id) {
        var optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
        var breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.findAllName();
    }


    
}
