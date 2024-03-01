package Service;

import com.example.stationdeski.entities.Inscription;
import com.example.stationdeski.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur getMoniteur(long idMoniteur);
    List<Moniteur> getAllMoniteurs();
    void deleteMoniteur(long idMoniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
}
