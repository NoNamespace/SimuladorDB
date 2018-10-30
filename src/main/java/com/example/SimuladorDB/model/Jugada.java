package com.example.SimuladorDB.model;

import javax.persistence.*;

@Entity
@Table(name = "jugada")
public class Jugada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "idgrupo")
    private long idGrupo;
    @Column(name = "propuestacompra")
    private long propuestaCompra;
    @Column(name = "propuestaventa")
    private long propuestaVenta;
    @Column(name = "utilidad")
    private long utilidad;
    @Column(name = "idronda")
    private long idRonda;
}
