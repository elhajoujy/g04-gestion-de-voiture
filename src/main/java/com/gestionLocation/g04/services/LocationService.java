package com.gestionLocation.g04.services;

import com.gestionLocation.g04.entities.Location;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocationService {
    Location saveLocation(Location location);

    Location updateLocation(Location location);

    Location getVoiture(Long id);

    List<Location> getAllLocations();
}
