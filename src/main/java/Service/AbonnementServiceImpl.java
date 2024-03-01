package Service;

import Repositories.AbonnementRepository;
import com.example.stationdeski.entities.Abonnement;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AbonnementServiceImpl implements IAbonnementService{
    AbonnementRepository abonnementRepository;
    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement getAbonnement(long idAbonnement) {
        return abonnementRepository.findById(idAbonnement).orElse(null);
    }

    @Override
    public List<Abonnement> getAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public void deleteAbonnement(long idAbonnement) {
abonnementRepository.deleteById(idAbonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }
}
