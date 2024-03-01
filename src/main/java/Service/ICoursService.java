package Service;


import com.example.stationdeski.entities.Cours;

import java.util.List;

public interface ICoursService {
    Cours addCours(Cours cours);
    Cours getCours(long idCours);
    List<Cours> getAllCours();
    void deleteCours(long idCours);
    Cours updateCours(Cours cours);
}
