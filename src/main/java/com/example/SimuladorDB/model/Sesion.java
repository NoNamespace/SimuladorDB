package com.example.SimuladorDB.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sesion")
public class Sesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicio;
    @Column(name = "fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fin;
    @Column(name = "idusuario")
    private long idUsuario;
}
