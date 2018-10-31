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

    public Jugada() {
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

    public long getPropuestaCompra() {
        return propuestaCompra;
    }

    public void setPropuestaCompra(long propuestaCompra) {
        this.propuestaCompra = propuestaCompra;
    }

    public long getPropuestaVenta() {
        return propuestaVenta;
    }

    public void setPropuestaVenta(long propuestaVenta) {
        this.propuestaVenta = propuestaVenta;
    }

    public long getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(long utilidad) {
        this.utilidad = utilidad;
    }

    public long getIdRonda() {
        return idRonda;
    }

    public void setIdRonda(long idRonda) {
        this.idRonda = idRonda;
    }
}
