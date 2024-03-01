package tn.esprit.station_ski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.station_ski.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste,Long> {
}
