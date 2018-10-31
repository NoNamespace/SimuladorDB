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

    public StockInicial() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(long capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    public long getProductosPorHoja() {
        return productosPorHoja;
    }

    public void setProductosPorHoja(long productosPorHoja) {
        this.productosPorHoja = productosPorHoja;
    }

    public long getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(long idSesion) {
        this.idSesion = idSesion;
    }
}
