package Service;

import Repositories.CoursRepository;
import com.example.stationdeski.entities.Cours;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursServiceImpl implements ICoursService{
    CoursRepository coursRepository;
    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours getCours(long idCours) {
        return coursRepository.findById(idCours).orElse(null
        );
    }

    @Override
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public void deleteCours(long idCours) {
coursRepository.deleteById(idCours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }
}
