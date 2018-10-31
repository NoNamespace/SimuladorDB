package com.example.SimuladorDB.controller;

import com.example.SimuladorDB.model.Usuario;
import com.example.SimuladorDB.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuario(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarioRepository.findAll().forEach(usuarios::add);
        return usuarios;
    }

    @PostMapping(value = "/usuarios/create")
    public Usuario postUsuario(@RequestBody Usuario usuario){
        Usuario _usuario = usuarioRepository.save(usuario);
        return _usuario;
    }

    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity<String> deleteUsuario(@PathVariable("id") long id){
        usuarioRepository.deleteById(id);
        return new ResponseEntity<>("Usuario has been deleted!", HttpStatus.OK);
    }
}
