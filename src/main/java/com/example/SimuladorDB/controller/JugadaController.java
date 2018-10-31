package com.example.SimuladorDB.controller;

import com.example.SimuladorDB.model.Jugada;
import com.example.SimuladorDB.repository.JugadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class JugadaController {

    @Autowired
    JugadaRepository jugadaRepository;

    @GetMapping("/jugadas")
    public List<Jugada> getAllJugada(){
        List<Jugada> jugadas = new ArrayList<>();
        jugadaRepository.findAll().forEach(jugadas::add);
        return jugadas;
    }

    @PostMapping(value = "/jugadas/create")
    public Jugada postJugada(@RequestBody Jugada jugada){
        Jugada _jugada = jugadaRepository.save(jugada);
        return _jugada;
    }

    @DeleteMapping("/jugadas/{id}")
    public ResponseEntity<String> deleteJugada(@PathVariable("id") long id){
        jugadaRepository.deleteById(id);
        return new ResponseEntity<>("Jugada has been deleted!", HttpStatus.OK);
    }
}
