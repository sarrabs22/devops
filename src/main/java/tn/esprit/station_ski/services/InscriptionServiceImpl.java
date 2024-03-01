package tn.esprit.station_ski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.station_ski.entities.Inscription;
import tn.esprit.station_ski.entities.Skieur;
import tn.esprit.station_ski.repositories.InscriptionRepository;
import tn.esprit.station_ski.repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionServiceImpl implements IInscriptionService{

    InscriptionRepository inscriptionRepository;
    SkieurRepository skieurRepository;
    @Override
    public List<Inscription> getAll() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription add(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public void delete(Long numInscription) {
        inscriptionRepository.deleteById(numInscription);
    }

    @Override
    public Inscription getById(Long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }

    @Transactional
    @Override
    public Inscription addInscriptionAndAssignToSkier(Inscription inscription, Long numSkier) {
        Skieur skieur = skieurRepository.findById(numSkier).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);
    }
}
