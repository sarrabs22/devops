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
public class Piste implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numPiste;

    String nomPiste;
    EnumColor color;
    int longeur;
    int pente;

    @ManyToMany
    Set<Skieur> skieurs;
}
