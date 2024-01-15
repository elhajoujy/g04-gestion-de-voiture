package com.gestionLocation.g04.web;

import com.gestionLocation.g04.entities.Client;
import com.gestionLocation.g04.repositories.ClientRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/gestionLocation")
public class ClientRestApiJaxRsApi {
  @Autowired
    private ClientRepository clientRepository;
  @Path("/clients")
  @GET
  @Produces({MediaType.APPLICATION_JSON})
    public List<Client> ListClients(){
        return clientRepository.findAll();
    }

    @Path("/clients/{idclient}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Client getClient(@PathParam(value = "idclient")Long idclient){
        return clientRepository.findById(idclient).get();
    }

  @Path("/gestionLocation")
  @POST
  @Produces({MediaType.APPLICATION_JSON})
  public Client save(Client client){
    return clientRepository.save(client);
  }

  @Path("/clients/{idclient}")
  @PUT
  @Produces({MediaType.APPLICATION_JSON})
  public Client update(Client client, @PathParam("idclient")Long idclient){
    client.setIdclient(idclient);
    return clientRepository.save(client);
  }

  @Path("/clients/{idclient}")
  @DELETE
  @Produces({MediaType.APPLICATION_JSON})
  public void delete(@PathParam("idclient")Long idclient){
    clientRepository.deleteById(idclient);

  }
}
