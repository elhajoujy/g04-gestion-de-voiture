package com.gestionLocation.g04.repositories;

import com.gestionLocation.g04.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {


}
