package tn.esprit.station_ski.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.station_ski.entities.Piste;
import tn.esprit.station_ski.services.AbonnementServiceImpl;
import tn.esprit.station_ski.services.IAbonnementService;
import tn.esprit.station_ski.services.IPisteService;
import tn.esprit.station_ski.services.PisteServiceImpl;

import java.util.List;

public class AbonnementController {
    IAbonnementService abonnementService;

    AbonnementController(AbonnementServiceImpl pisteService){
        this.abonnementService = (IAbonnementService) pisteService;
    }

    @GetMapping("/piste")
    List<Piste> getAllPiste(){
        return  abonnementService.();
    }

    @GetMapping("/piste/{pisteNum}")
    Piste getAllPiste(@PathVariable long pisteNum){
        return  pisteService.retrievePiste(pisteNum);
    }

    @PostMapping("/piste")
    Piste addPiste(@RequestBody Piste piste){
        return pisteService.addPiste(piste);
    }

    @PutMapping("/piste")
    Piste updatePiste(@RequestBody Piste piste){
        return pisteService.updatePiste(piste);
    }
}
