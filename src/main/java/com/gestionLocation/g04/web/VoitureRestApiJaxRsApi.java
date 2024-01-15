package com.gestionLocation.g04.web;

import com.gestionLocation.g04.entities.Voiture;
import com.gestionLocation.g04.repositories.VoitureRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gestionLocation")
public class VoitureRestApiJaxRsApi {
    @Autowired
    private VoitureRepository voitureRepository;



    @GetMapping("/voitures")
    public List<Voiture> ListVoitures(){
        return voitureRepository.findAll();
    }


    @GetMapping("/voitures/{idvoiture}")
    public Voiture getVoiture(@PathParam(value = "idvoiture")Long idvoiture){
        return voitureRepository.findById(idvoiture).get();
    }


    @PostMapping("/voitures")
    public Voiture save(Voiture voiture){
        return voitureRepository.save(voiture);
    }


    @PutMapping("/voitures/{idvoiture}")
    public Voiture update(Voiture voiture, @PathParam("idvoiture")Long idvoiture){
        voiture.setIdvoiture(idvoiture);
        return voitureRepository.save(voiture);
    }


    @DeleteMapping("/voitures/{idvoiture}")
    public void delete(@PathParam("idvoiture")Long idvoiture){
        voitureRepository.deleteById(idvoiture);

    }
}
