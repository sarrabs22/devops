package Service;

import Repositories.MoniteurRepository;
import com.example.stationdeski.entities.Moniteur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MoniteurServiceImpl implements IMoniteurService{
    MoniteurRepository moniteurRepository;
    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur getMoniteur(long idMoniteur) {
        return moniteurRepository.findById(idMoniteur).orElse(null);
    }

    @Override
    public List<Moniteur> getAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public void deleteMoniteur(long idMoniteur) {
moniteurRepository.deleteById(idMoniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }
}
