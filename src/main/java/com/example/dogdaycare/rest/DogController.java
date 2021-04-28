package com.example.dogdaycare.rest;

import com.example.dogdaycare.entity.Dog;
import com.example.dogdaycare.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class DogController {
    private final DogService dogService;

    @Autowired
    public DogController(@Qualifier("dogServiceIMPL") DogService dogService) {
        this.dogService = dogService;
    }

    // get list
    @GetMapping("/dogs")
    public List<Dog> findAll(){
        return dogService.findAll();
    }

    // post object
    @PostMapping("/dogs")
    public Dog addDog(@RequestBody Dog theDog){
        theDog.setId(0);
        dogService.saveOrUpdate(theDog);
        return theDog;
    }
    // put object
    @PutMapping("/dogs")
    public Dog updateDog(@RequestBody Dog theDog){
        dogService.saveOrUpdate(theDog);
        return theDog;
    }

    // delete object
    @DeleteMapping("/dogs/{dogId}")
    public String deleteDog(@PathVariable int dogId ){
        dogService.deleteById(dogId);
        return "Deleted dog id: " + dogId;
    }

    // get by id request
    @GetMapping("/dogs/{dogId}")
    public Object getDogById(@PathVariable int dogId){
        return dogService.findById(dogId);
    }
}
