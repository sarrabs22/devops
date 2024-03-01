package Service;

import Repositories.SkieurRepository;
import com.example.stationdeski.entities.Skieur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkieurServiceImpl implements ISkieurService{
    SkieurRepository skieurRepository;
    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur getSkieur(long idSkieur) {
        return skieurRepository.findById(idSkieur).orElse(null);
    }

    @Override
    public List<Skieur> getAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public void deleteSkieur(long idSkieur) {
skieurRepository.deleteById(idSkieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }
}
