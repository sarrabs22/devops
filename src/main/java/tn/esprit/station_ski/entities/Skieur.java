package tn.esprit.station_ski.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skieur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSkieur;
    String nomS;
    String prenomS;
    LocalDate dateNaissance;
    String ville;
    @ManyToMany(mappedBy = "skieurs")
    Set<Piste>  pistes;
    @OneToMany(mappedBy = "skieur",cascade = CascadeType.ALL)
    Set<Inscription> inscriptions;

    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abonnement;
}
