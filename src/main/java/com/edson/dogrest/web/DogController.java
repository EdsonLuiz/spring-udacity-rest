package com.edson.dogrest.web;

import com.edson.dogrest.entity.Dog;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {
    
    @GetMapping("/dogs")
    public ResponseEntity<Dog> getDog() {
        var dog = new Dog("Some Dog", "Some breed", "Some origin");
        return new ResponseEntity<Dog>(dog, HttpStatus.OK);
    }
}
