package com.gestionLocation.g04.services;

import com.gestionLocation.g04.entities.Voiture;
import com.gestionLocation.g04.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoitureServiceImpl implements VoitureService{

    @Autowired
    VoitureRepository voitureRepository;
    @Override
    public Voiture saveVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    @Override
    public Voiture updateVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    @Override
    public Voiture getVoiture(Long id) {
        return voitureRepository.findById(id).get();
    }

    @Override
    public List<Voiture> getAllVoitures() {
        return voitureRepository.findAll();
    }

    @Override
    public void deleteVoitureById(Long id) {
        voitureRepository.deleteById(id);
    }

    @Override
    public void deleteAllProducts() {
        voitureRepository.deleteAll();
    }
}
