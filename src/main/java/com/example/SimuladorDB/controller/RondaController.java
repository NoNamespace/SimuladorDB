package com.example.SimuladorDB.controller;

import com.example.SimuladorDB.model.Ronda;
import com.example.SimuladorDB.repository.RondaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class RondaController {

    @Autowired
    RondaRepository rondaRepository;

    @GetMapping("/rondas")
    public List<Ronda> getAllRonda(){
        List<Ronda> rondas = new ArrayList<>();
        rondaRepository.findAll().forEach(rondas::add);
        return rondas;
    }

    @PostMapping(value = "/rondas/create")
    public Ronda postRonda(@RequestBody Ronda ronda){
        Ronda _ronda = rondaRepository.save(ronda);
        return _ronda;
    }

    @DeleteMapping("/rondas/{id}")
    public ResponseEntity<String> deleteRonda(@PathVariable("id") long id){
        rondaRepository.deleteById(id);
        return new ResponseEntity<>("Ronda has been deleted!", HttpStatus.OK);
    }
}
