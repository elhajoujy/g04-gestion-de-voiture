package com.gestionLocation.g04.repositories;

import com.gestionLocation.g04.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
