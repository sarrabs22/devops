package tn.esprit.station_ski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.station_ski.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
