package Service;


import com.example.stationdeski.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    Inscription addInscription(Inscription inscription);
    Inscription getInscription(long idInscription);
    List<Inscription> getAllInscriptions();
    void deleteInscription(long idInscription);
    Inscription updateInscription(Inscription inscription);
}
