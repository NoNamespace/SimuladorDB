package com.example.SimuladorDB.model;

import javax.persistence.*;

@Entity
@Table(name = "ronda")
public class Ronda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "pmp")
    private double pmp;
    @Column(name = "pp")
    private double pp;
    @Column(name = "idsesion")
    private long idSesion;
}
