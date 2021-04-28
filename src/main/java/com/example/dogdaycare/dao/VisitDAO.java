package com.example.dogdaycare.dao;

import com.example.dogdaycare.entity.Visit;

import java.util.List;

public interface VisitDAO {
    List<Visit> findAll();
    Object findById(int theId);
    void saveOrUpdate(Visit theVisit);
    void deleteById(int theId);
}
