package com.edson.dogrest.service;

import java.util.List;

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


    
}
