package tn.esprit.station_ski.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.station_ski.entities.Cours;
import tn.esprit.station_ski.repositories.CoursRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursServiceImpl implements ICoursService{

    CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCourses() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save((cours));
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }
}
