package com.gestionLocation.g04.services.impl;

import com.gestionLocation.g04.entities.Location;
import com.gestionLocation.g04.repositories.LocationRepository;
import com.gestionLocation.g04.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepository locationRepository;

    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location) ;
    }

    @Override
    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location getVoiture(Long id) {
        return locationRepository.findById(id).get();
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
