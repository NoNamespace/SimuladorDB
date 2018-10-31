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

    public Ronda() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPmp() {
        return pmp;
    }

    public void setPmp(double pmp) {
        this.pmp = pmp;
    }

    public double getPp() {
        return pp;
    }

    public void setPp(double pp) {
        this.pp = pp;
    }

    public long getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(long idSesion) {
        this.idSesion = idSesion;
    }
}
