package com.example.stationdeski.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity

public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numPiste ;
    String nomPiste ;
    @Enumerated
    Couleur couleur;
    int longueur ;
    int pente ;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur> skieurs;
}
