package tn.esprit.station_ski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.station_ski.entities.Skieur;
import tn.esprit.station_ski.repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SkieurServiceImpl implements ISkieurService{

    SkieurRepository skieurRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }
}
