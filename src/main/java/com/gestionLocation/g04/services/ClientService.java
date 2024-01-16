package com.gestionLocation.g04.services;

import com.gestionLocation.g04.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientService {
    Client saveClient(Client client);

    Client updateClient(Client client);

    Client getClient(Long id);

    List<Client> getAllClients();

    void deleteClientById(Long id);

    void deleteAllClients();
}
