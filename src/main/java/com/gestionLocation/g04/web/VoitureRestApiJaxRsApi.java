package com.gestionLocation.g04.web;

import com.gestionLocation.g04.entities.Voiture;
import com.gestionLocation.g04.repositories.VoitureRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/gestionLocation")
public class VoitureRestApiJaxRsApi {
    @Autowired
    private VoitureRepository voitureRepository;

    @Path("/voitures")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Voiture> ListVoitures(){
        return voitureRepository.findAll();
    }

    @Path("/voitures/{idvoiture}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Voiture getVoiture(@PathParam(value = "idvoiture")Long idvoiture){
        return voitureRepository.findById(idvoiture).get();
    }

    @Path("/voitures")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Voiture save(Voiture voiture){
        return voitureRepository.save(voiture);
    }

    @Path("/voitures/{idvoiture}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Voiture update(Voiture voiture, @PathParam("idvoiture")Long idvoiture){
        voiture.setIdvoiture(idvoiture);
        return voitureRepository.save(voiture);
    }

    @Path("/voitures/{idvoiture}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathParam("idvoiture")Long idvoiture){
        voitureRepository.deleteById(idvoiture);

    }
}
