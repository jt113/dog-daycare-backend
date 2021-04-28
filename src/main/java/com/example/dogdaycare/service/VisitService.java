package com.example.dogdaycare.service;

import com.example.dogdaycare.entity.Client;
import com.example.dogdaycare.entity.Visit;

import java.util.List;

public interface VisitService {
    List<Visit> findAll();
    Object findById(int visitId);
    void saveOrUpdate(Visit theVisit);
    void deleteById(int visitId);
}
