package tn.esprit.station_ski.services;

import org.springframework.stereotype.Service;
import tn.esprit.station_ski.entities.Moniteur;

import java.util.List;

@Service
public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
}
