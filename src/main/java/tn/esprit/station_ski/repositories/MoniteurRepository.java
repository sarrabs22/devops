package tn.esprit.station_ski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.station_ski.entities.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {
}
