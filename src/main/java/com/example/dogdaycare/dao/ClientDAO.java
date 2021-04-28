package com.example.dogdaycare.dao;

import com.example.dogdaycare.entity.Client;

import java.util.List;

public interface ClientDAO {
    List<Client> findAll();
    Object findById(int theId);
    void saveOrUpdate(Client theClient);
    void deleteById(int theId);
}
