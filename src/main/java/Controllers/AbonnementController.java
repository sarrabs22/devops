package Controllers;

import Service.AbonnementServiceImpl;
import com.example.stationdeski.entities.Abonnement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AbonnementController {
AbonnementServiceImpl abonnementService;
    @PostMapping("/abonnement")
    Abonnement addbloc(@RequestBody com.example.stationdeski.entities.Abonnement abonnement) {
        return abonnementService.addAbonnement(abonnement);
    }

    @GetMapping("/abonnement/{id}")
    Abonnement retrieveBloc(@PathVariable Long id) {
        return abonnementService.getAbonnement(id);
    }
    @GetMapping("/abonnement")
    List<Abonnement> retrieveBlocs(){
        return abonnementService.getAllAbonnements();
    }
    @DeleteMapping("/abonnement/{id}")
    void deleteBloc(@PathVariable Long id){
        abonnementService.deleteAbonnement(id);
    }
    @PutMapping("/abonnement")
    Abonnement updateBloc(@RequestBody Abonnement abonnement){
        return abonnementService.updateAbonnement(abonnement);
    }
}
