package tn.esprit.station_ski.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numInscription;
    int numSemaine;

    @ManyToOne
    Skieur skieur;

    @ManyToOne
    Cours cours;
}
