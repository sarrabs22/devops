package tn.esprit.station_ski.services;

import tn.esprit.station_ski.entities.Abonnement;
import tn.esprit.station_ski.entities.Skieur;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> getAll();
    Abonnement add(Abonnement abonnement);
    void delete (Long numAbon);
    Abonnement getById (Long numAbon);
}
