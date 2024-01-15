package com.gestionLocation.g04.web;

import com.gestionLocation.g04.entities.Client;
import com.gestionLocation.g04.repositories.ClientRepository;
import jakarta.websocket.server.PathParam;
//import jakarta.ws.rs.*;
//import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientRestApiJaxRsApi {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> ListClients() {
        return clientRepository.findAll();
    }


    @GetMapping("/clients/{idclient}")
    public Client getClient(@PathParam(value = "idclient") Long idclient) {
        return clientRepository.findById(idclient).get();
    }

    @PostMapping("/gestionLocation")
    public Client save(Client client) {
        return clientRepository.save(client);
    }


    @PutMapping("/clients/{idclient}")
    public Client update(Client client, @PathParam("idclient") Long idclient) {
        client.setIdclient(idclient);
        return clientRepository.save(client);
    }


    @DeleteMapping("/clients/{idclient}")
    public void delete(@PathParam("idclient") Long idclient) {
        clientRepository.deleteById(idclient);

    }
}
