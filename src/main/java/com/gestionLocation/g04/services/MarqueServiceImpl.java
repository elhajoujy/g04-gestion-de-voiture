package com.gestionLocation.g04.services;

import com.gestionLocation.g04.entities.Location;
import com.gestionLocation.g04.entities.Marque;
import com.gestionLocation.g04.repositories.LocationRepository;
import com.gestionLocation.g04.repositories.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarqueServiceImpl implements MarqueService {
    @Autowired
    MarqueRepository marqueRepository;

    @Override
    public Marque saveMarque(Marque marque) {
        return marqueRepository.save(marque) ;
    }
    @Override
    public Marque updateMarque(Marque marque){
        return marqueRepository.save(marque) ;
    }
    @Override
    public Marque getVoiture(Long idv){
        return marqueRepository.findById(idv).get();
    }

    @Override
    public List<Marque> getAllMarques() {
        return marqueRepository.findAll();
    }
}
