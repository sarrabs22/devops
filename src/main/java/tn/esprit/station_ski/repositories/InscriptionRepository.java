package tn.esprit.station_ski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.station_ski.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
