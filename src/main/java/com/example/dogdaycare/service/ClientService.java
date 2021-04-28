package com.example.dogdaycare.service;

import com.example.dogdaycare.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> findAll();
    Object findById(int clientId);
    void saveOrUpdate(Client theClient);
    void deleteById(int clientId);
}
