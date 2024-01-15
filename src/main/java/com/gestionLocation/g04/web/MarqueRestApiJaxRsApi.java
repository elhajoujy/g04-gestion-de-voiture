package com.gestionLocation.g04.web;

import com.gestionLocation.g04.entities.Location;
import com.gestionLocation.g04.entities.Marque;
import com.gestionLocation.g04.repositories.LocationRepository;
import com.gestionLocation.g04.repositories.MarqueRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/gestionLocation")
public class MarqueRestApiJaxRsApi {

    @Autowired
    private MarqueRepository marqueRepository;

    @GetMapping("/marques")
    public List<Marque> ListMarques(){
        return marqueRepository.findAll();
    }

    @GetMapping("/marques/{IdMarque}")
    public Marque getMarque(@PathParam(value = "IdMarque")Long IdMarque){
        return marqueRepository.findById(IdMarque).get();
    }


    @PostMapping("/marques")
    public Marque save(Marque marque){
        return marqueRepository.save(marque);
    }


    @PutMapping("/marques/{IdMarque}")
    public Marque update(Marque marque, @PathParam("IdMarque")Long IdMarque){
        marque.setIdMarque(IdMarque);
        return marqueRepository.save(marque);
    }


    @DeleteMapping("/marques/{IdMarque}")
    public void delete(@PathParam("IdMarque")Long IdMarque){
        marqueRepository.deleteById(IdMarque);

    }
}
