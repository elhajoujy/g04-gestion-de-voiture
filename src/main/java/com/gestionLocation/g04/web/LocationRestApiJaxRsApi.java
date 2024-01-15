package com.gestionLocation.g04.web;


import com.gestionLocation.g04.entities.Client;
import com.gestionLocation.g04.entities.Location;
import com.gestionLocation.g04.repositories.ClientRepository;
import com.gestionLocation.g04.repositories.LocationRepository;
import jakarta.websocket.server.PathParam;
//import jakarta.ws.rs.*;
//import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Component
//@Path("/gestionLocation")
@RequestMapping("/gestionLocation")
@RestController
public class LocationRestApiJaxRsApi {
    @Autowired
    private LocationRepository locationRepository;
//    @Path("/locations")
//    @GET
//    @Produces({MediaType.APPLICATION_JSON})
    @GetMapping("/locations")
    public List<Location> ListLocations(){
        return locationRepository.findAll();
    }

//    @Path("/locations/{idLocation}")
//    @GET
//    @Produces({MediaType.APPLICATION_JSON})
    @GetMapping("/locations/{idLocation}")
    public Location getLocation(@PathParam(value = "idLocation") Long idLocation){
        return locationRepository.findById(idLocation).get();
    }
    @Path("/gestionLocation")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Location save(Location location){
        return locationRepository.save(location);
    }

    @Path("/locations/{idLocation}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Location update(Location location, @PathParam("idLocation")Long idLocation){
        location.setIdLocation(idLocation);
        return locationRepository.save(location);
    }
    @Path("/locations/{idLocation}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathParam("idLocation")Long idLocation){
        locationRepository.deleteById(idLocation);

    }
}
