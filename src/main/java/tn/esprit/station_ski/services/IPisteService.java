package tn.esprit.station_ski.services;

import org.springframework.stereotype.Service;
import tn.esprit.station_ski.entities.Piste;

import java.util.List;

@Service
public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
}
