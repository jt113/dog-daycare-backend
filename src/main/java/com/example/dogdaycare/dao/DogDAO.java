package com.example.dogdaycare.dao;

import com.example.dogdaycare.entity.Dog;

import java.util.List;

public interface DogDAO {
    List<Dog> findAll();
    Object findById(int theId);
    void saveOrUpdate(Dog theDog);
    void deleteById(int theId);
}
