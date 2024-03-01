package tn.esprit.station_ski.services;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;
import tn.esprit.station_ski.entities.Skieur;

import java.util.List;

@Service
public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
}
