package Service;

import com.example.stationdeski.entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement getAbonnement(long idAbonnement);
    List<Abonnement> getAllAbonnements();
    void deleteAbonnement(long idAbonnement);
    Abonnement updateAbonnement(Abonnement abonnement);

}
