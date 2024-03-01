package com.example.stationdeski.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numAbon;
    LocalDate dateDebut ;
    LocalDate dateFin ;
    float prixAbon ;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbonnement ;

}
