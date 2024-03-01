package Service;


import com.example.stationdeski.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    Skieur addSkieur(Skieur skieur);
    Skieur getSkieur(long idSkieur);
    List<Skieur> getAllSkieurs();
    void deleteSkieur(long idSkieur);
    Skieur updateSkieur(Skieur skieur);
}
