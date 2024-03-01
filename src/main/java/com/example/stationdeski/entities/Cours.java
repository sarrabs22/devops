package com.example.stationdeski.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Cours  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numCours;
    int niveau ;
    @Enumerated
    TypeCours typeCours;
    @Enumerated
    Support support;
    float prix ;
    int creneau ;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="cour")
    private Set<Inscription> inscriptions ;
}
