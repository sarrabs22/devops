package Service;

import com.example.stationdeski.entities.Moniteur;
import com.example.stationdeski.entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste piste);
    Piste getPiste(long idPiste);
    List<Piste> getAllPistes();
    void deletePiste(long idPiste);
    Piste updatePiste(Piste piste);
}
