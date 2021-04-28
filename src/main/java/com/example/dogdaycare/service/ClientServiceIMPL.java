package com.example.dogdaycare.service;

import com.example.dogdaycare.dao.ClientDAO;
import com.example.dogdaycare.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceIMPL  implements ClientService {
    private final ClientDAO clientDAO;

    @Autowired
    public ClientServiceIMPL(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Override
    public List<Client> findAll() {
        return clientDAO.findAll();
    }

    @Override
    public Object findById(int clientId) {
        return clientDAO.findById(clientId);
    }

    @Override
    public void saveOrUpdate(Client theClient) {
        clientDAO.saveOrUpdate(theClient);
    }

    @Override
    public void deleteById(int clientId) {
        clientDAO.deleteById(clientId);
    }
}
