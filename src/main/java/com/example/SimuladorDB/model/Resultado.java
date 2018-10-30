package com.example.SimuladorDB.model;

import javax.persistence.*;

@Entity
@Table(name = "resultado")
public class Resultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "inventario")
    private long inventario;
    @Column(name = "utilidad")
    private double utilidad;
    @Column(name = "valor")
    private double valor;
    @Column(name = "idreporte")
    private long idReporte;
}
