package com.example.dogdaycare.dao;

import com.example.dogdaycare.entity.Client;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ClientIMPL implements ClientDAO{
    private final EntityManager entityManager;

    @Autowired
    public ClientIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Client> findAll() {
        Session currentSession =entityManager.unwrap(Session.class);
        Query<Client> myQuery = currentSession.createQuery("from Client");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int theId) {
        Session currentSession =entityManager.unwrap(Session.class);
        return currentSession.get(Client.class, theId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Client theClient) {
        Session currentSession =entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theClient);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession =entityManager.unwrap(Session.class);
        Client myClient = currentSession.get(Client.class, theId);
        currentSession.delete(myClient);
    }
}
