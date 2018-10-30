package com.example.SimuladorDB.controller;

import com.example.SimuladorDB.model.Sesion;
import com.example.SimuladorDB.repository.SesionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SesionController {

    SesionRepository sesionRepository;

    @GetMapping("/sesions")
    public List<Sesion> getAllSesion(){
        List<Sesion> sesions = new ArrayList<>();
        sesionRepository.findAll().forEach(sesions::add);
        return sesions;
    }

    @PostMapping(value = "/sesions/create")
    public Sesion postSesion(@RequestBody Sesion sesion){
        Sesion _sesion = sesionRepository.save(sesion);
        return _sesion;
    }

    @DeleteMapping("/sesions/{id}")
    public ResponseEntity<String> deleteSesion(@PathVariable("id") long id){
        sesionRepository.deleteById(id);
        return new ResponseEntity<>("Sesion has been deleted!", HttpStatus.OK);
    }
}
