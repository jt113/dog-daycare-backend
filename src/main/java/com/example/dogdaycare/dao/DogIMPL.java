package com.example.dogdaycare.dao;

import com.example.dogdaycare.entity.Dog;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class DogIMPL implements DogDAO {

    private EntityManager entityManager;

    @Autowired
    public DogIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Dog> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Dog> myQuery =currentSession.createQuery("from Dog");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Dog.class, theId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Dog theDog) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theDog);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Dog myDog = currentSession.get(Dog.class, theId);
        currentSession.delete(myDog);
    }
}
