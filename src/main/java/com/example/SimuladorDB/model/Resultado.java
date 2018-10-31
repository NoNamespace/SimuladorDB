package com.example.SimuladorDB.model;

import javax.persistence.*;

@Entity
@Table(name = "resultado")
public class Resultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "idgrupo")
    private long idGrupo;
    @Column(name = "inventario")
    private long inventario;
    @Column(name = "utilidad")
    private double utilidad;
    @Column(name = "valor")
    private double valor;
    @Column(name = "idreporte")
    private long idReporte;

    public Resultado() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public long getInventario() {
        return inventario;
    }

    public void setInventario(long inventario) {
        this.inventario = inventario;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public long getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(long idReporte) {
        this.idReporte = idReporte;
    }
}
