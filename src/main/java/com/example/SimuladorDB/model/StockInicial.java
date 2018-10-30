package com.example.SimuladorDB.model;

import javax.persistence.*;

@Entity
@Table(name = "stockinicial")
public class StockInicial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "capitalinicial")
    private long capitalInicial;
    @Column(name = "productosporhoja")
    private long productosPorHoja;
    @Column(name = "idsesion")
    private long idSesion;
}
