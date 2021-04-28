package com.example.dogdaycare.service;


import com.example.dogdaycare.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> findAll();
    Object findById(int dogId);
    void saveOrUpdate(Dog theDog);
    void deleteById(int dogId);
}
