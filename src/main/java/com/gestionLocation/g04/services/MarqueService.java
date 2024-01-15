package com.gestionLocation.g04.services;

import com.gestionLocation.g04.entities.Location;
import com.gestionLocation.g04.entities.Marque;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MarqueService {
    Marque saveMarque(Marque marque);

    Marque updateMarque(Marque marque);

    Marque getVoiture(Long idv);

    List<Marque> getAllMarques();
}
