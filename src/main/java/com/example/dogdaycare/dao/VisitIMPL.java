package com.example.dogdaycare.dao;

import com.example.dogdaycare.entity.Visit;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class VisitIMPL implements VisitDAO {
    private EntityManager entityManager;

    @Autowired
    public VisitIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Visit> findAll() {
        Session currentSession =entityManager.unwrap(Session.class);
        Query<Visit> myQuery = currentSession.createQuery("from Visit");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int theId) {
        Session currentSession =entityManager.unwrap(Session.class);
        return currentSession.get(Visit.class, theId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Visit theVisit) {
        Session currentSession =entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theVisit);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession =entityManager.unwrap(Session.class);
        Visit myVisit = currentSession.get(Visit.class, theId);
        currentSession.delete(myVisit);
    }
}
