package com.example.dogdaycare.service;

import com.example.dogdaycare.dao.DogDAO;
import com.example.dogdaycare.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceIMPL implements DogService {
    private final DogDAO dogDAO;

    @Autowired
    public DogServiceIMPL(DogDAO dogDAO) {
        this.dogDAO = dogDAO;
    }

    @Override
    public List<Dog> findAll() {
        return this.dogDAO.findAll();
    }

    @Override
    public Object findById(int dogId) {
        return dogDAO.findById(dogId);
    }

    @Override
    public void saveOrUpdate(Dog theDog) {
        dogDAO.saveOrUpdate(theDog);
    }

    @Override
    public void deleteById(int dogId) {
        dogDAO.deleteById(dogId);
    }
}
