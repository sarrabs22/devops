package tn.esprit.station_ski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.station_ski.entities.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
}
