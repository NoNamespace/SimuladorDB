package com.example.SimuladorDB.repository;

import com.example.SimuladorDB.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{}
