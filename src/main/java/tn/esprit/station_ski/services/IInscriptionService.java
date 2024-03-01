package tn.esprit.station_ski.services;

import tn.esprit.station_ski.entities.Abonnement;
import tn.esprit.station_ski.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> getAll();
    Inscription add(Inscription inscription);
    void delete (Long numInscription);
    Inscription getById (Long numInscription);

    Inscription addInscriptionAndAssignToSkier(Inscription inscription, Long numSkier);
    Inscription assignInscriptionToCourse(Long numInscription, Long numCourse);
}
