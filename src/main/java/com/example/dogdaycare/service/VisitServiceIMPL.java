package com.example.dogdaycare.service;

import com.example.dogdaycare.dao.VisitDAO;
import com.example.dogdaycare.entity.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitServiceIMPL implements VisitService {
    private final VisitDAO visitDAO;

    @Autowired
    public VisitServiceIMPL(VisitDAO visitDAO) {
        this.visitDAO = visitDAO;
    }

    @Override
    public List<Visit> findAll() {
        return visitDAO.findAll();
    }

    @Override
    public Object findById(int visitId) {
        return visitDAO.findById(visitId);
    }

    @Override
    public void saveOrUpdate(Visit theVisit) {
        visitDAO.saveOrUpdate(theVisit);
    }

    @Override
    public void deleteById(int visitId) {
        visitDAO.deleteById(visitId);
    }
}
