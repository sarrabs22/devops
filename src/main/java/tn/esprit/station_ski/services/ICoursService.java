package tn.esprit.station_ski.services;

import org.springframework.stereotype.Service;
import tn.esprit.station_ski.entities.Cours;

import java.util.List;

@Service
public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
}
