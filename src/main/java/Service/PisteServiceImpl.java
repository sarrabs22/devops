package Service;

import Repositories.PisteRepository;
import com.example.stationdeski.entities.Piste;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PisteServiceImpl implements IPisteService{
    PisteRepository pisteRepository;
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste getPiste(long idPiste) {
        return pisteRepository.findById(idPiste).orElse(null);
    }

    @Override
    public List<Piste> getAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public void deletePiste(long idPiste) {
        pisteRepository.deleteById(idPiste);

    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }
}
