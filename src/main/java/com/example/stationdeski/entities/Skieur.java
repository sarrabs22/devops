package com.example.stationdeski.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSkieur ;
    String nomS;
    String prenomS;
    LocalDate dateNaissance ;
    String ville ;
    @OneToOne
    private Abonnement abonnement ;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="skieur")
    private Set<Inscription> inscriptions ;

    @ManyToMany(mappedBy="skieurs", cascade = CascadeType.ALL)

    private Set<Piste> pistes;
}
