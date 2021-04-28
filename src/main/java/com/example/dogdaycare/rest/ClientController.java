package com.example.dogdaycare.rest;


import com.example.dogdaycare.entity.Client;
import com.example.dogdaycare.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(@Qualifier("clientServiceIMPL") ClientService clientService) {
        this.clientService = clientService;
    }

    // get request for client list
    @GetMapping("/clients")
    public List<Client> findAll(){
        return clientService.findAll();
    }

    // post request for client object
    @PostMapping("/clients")
    public Client addClient(@RequestBody Client theClient){
        theClient.setId(0);
        clientService.saveOrUpdate(theClient);
        return theClient;
    }
    // put request for client object
    @PutMapping("/clients")
    public Client updateClient(@RequestBody Client theClient){
        clientService.saveOrUpdate(theClient);
        return theClient;
    }

    // delete request for client object
    @DeleteMapping("/clients/{clientId}")
    public String deleteClient(@PathVariable int clientId){
        clientService.deleteById(clientId);
        return "Deleted client id: " + clientId;
    }

    // get by id request for client object
    @GetMapping("/clients/{clientId}")
    public Object getClientById(@PathVariable int clientId){
        return clientService.findById(clientId);
    }
}
