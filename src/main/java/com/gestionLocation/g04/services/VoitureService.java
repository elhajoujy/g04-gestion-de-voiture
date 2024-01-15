package com.gestionLocation.g04.services;

import com.gestionLocation.g04.entities.Voiture;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface VoitureService {
    Voiture saveVoiture(Voiture voiture);

    Voiture updateVoiture(Voiture voiture);

    Voiture getVoiture(Long id);

    List<Voiture> getAllVoitures();

    void deleteVoitureById(Long id);

    void deleteAllProducts();
}
