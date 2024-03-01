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
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numMoniteur;

    String nomM;
    String prenomM;
    LocalDate dateRecru;
    @OneToMany
    Set<Cours> coursSet;
}
