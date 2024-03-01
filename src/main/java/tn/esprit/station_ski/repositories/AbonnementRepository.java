package tn.esprit.station_ski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.station_ski.entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
}
