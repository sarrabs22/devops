package com.example.stationdeski.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numInscription ;
    int numSemaine ;
    @ManyToOne
    Skieur skieur;
    @ManyToOne
    Cours cour;
}
