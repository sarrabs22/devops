package tn.esprit.station_ski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.station_ski.entities.Piste;
import tn.esprit.station_ski.repositories.PisteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImpl implements IPisteService{

    PisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }
}
