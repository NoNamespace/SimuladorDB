package com.example.SimuladorDB.model;

import javax.persistence.*;

@Entity
@Table(name = "reporte")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "idsesion")
    private long idSesion;
}
