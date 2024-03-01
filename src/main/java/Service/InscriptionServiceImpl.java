package Service;

import Repositories.InscriptionRepository;
import com.example.stationdeski.entities.Inscription;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InscriptionServiceImpl implements IInscriptionService{
    InscriptionRepository inscriptionRepository;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription getInscription(long idInscription) {
        return inscriptionRepository.findById(idInscription).orElse(null);
    }

    @Override
    public List<Inscription> getAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public void deleteInscription(long idInscription) {
inscriptionRepository.deleteById(idInscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }
}
