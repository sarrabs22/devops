package tn.esprit.station_ski.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.station_ski.entities.Moniteur;
import tn.esprit.station_ski.repositories.MoniteurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MoniteurServiceImpl implements IMoniteurService{

    MoniteurRepository moniteurRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }
}
