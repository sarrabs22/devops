package tn.esprit.station_ski.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.station_ski.entities.Piste;
import tn.esprit.station_ski.services.IPisteService;
import tn.esprit.station_ski.services.PisteServiceImpl;

import java.util.List;

@RestController
public class PisteController {
    IPisteService pisteService;

    PisteController(PisteServiceImpl pisteService){
        this.pisteService = pisteService;
    }

    @GetMapping("/piste")
    List<Piste> getAllPiste(){
        return  pisteService.retrieveAllPistes();
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
