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
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/gestionLocation")
@RestController
public class LocationRestApiJaxRsApi {
    @Autowired
    private LocationRepository locationRepository;
    @GetMapping("/locations")
    public List<Location> ListLocations(){
        return locationRepository.findAll();
    }


    @GetMapping("/locations/{idLocation}")
    public Location getLocation(@PathParam(value = "idLocation") Long idLocation){
        return locationRepository.findById(idLocation).get();
    }

    @PostMapping("/gestionLocation")
    public Location save(Location location){
        return locationRepository.save(location);
    }


    @PutMapping("/locations/{idLocation}")
    public Location update(Location location, @PathParam("idLocation")Long idLocation){
        location.setIdLocation(idLocation);
        return locationRepository.save(location);
    }


    @DeleteMapping("/locations/{idLocation}")
    public void delete(@PathParam("idLocation")Long idLocation){
        locationRepository.deleteById(idLocation);

    }
}
