package tn.esprit.station_ski.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numCours;
    int niveau;
    TypeCours typeCours;
    EnumSupport support;
    float prix;
    int creneau;

    @OneToMany(mappedBy = "cours")
    Set<Inscription> inscriptions;
}
