package com.gestionLocation.g04.web;

import com.gestionLocation.g04.entities.Location;
import com.gestionLocation.g04.entities.Marque;
import com.gestionLocation.g04.repositories.LocationRepository;
import com.gestionLocation.g04.repositories.MarqueRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/gestionLocation")
public class MarqueRestApiJaxRsApi {
    @Autowired
    private MarqueRepository marqueRepository;
    @Path("/marques")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Marque> ListMarques(){
        return marqueRepository.findAll();
    }

    @Path("/marques/{IdMarque}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Marque getMarque(@PathParam(value = "IdMarque")Long IdMarque){
        return marqueRepository.findById(IdMarque).get();
    }
    @Path("/gestionLocation")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Marque save(Marque marque){
        return marqueRepository.save(marque);
    }

    @Path("/marques/{IdMarque}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Marque update(Marque marque, @PathParam("IdMarque")Long IdMarque){
        marque.setIdMarque(IdMarque);
        return marqueRepository.save(marque);
    }
    @Path("/marques/{IdMarque}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathParam("IdMarque")Long IdMarque){
        marqueRepository.deleteById(IdMarque);

    }
}
