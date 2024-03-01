package com.example.stationdeski.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numMoniteur ;
    String nomM;
    String prenomM ;
    LocalDate dateRecru ;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;
}
