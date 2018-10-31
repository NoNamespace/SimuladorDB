package com.example.SimuladorDB.controller;

import com.example.SimuladorDB.model.Reporte;
import com.example.SimuladorDB.repository.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ReporteController {

    @Autowired
    ReporteRepository reporteRepository;

    @GetMapping("/reportes")
    public List<Reporte> getAllReporte(){
        List<Reporte> reportes = new ArrayList<>();
        reporteRepository.findAll().forEach(reportes::add);
        return reportes;
    }

    @PostMapping(value = "/reportes/create")
    public Reporte postReporte(@RequestBody Reporte reporte){
        Reporte _reporte = reporteRepository.save(reporte);
        return _reporte;
    }

    @DeleteMapping("/reportes/{id}")
    public ResponseEntity<String> deleteReporte(@PathVariable("id") long id){
        reporteRepository.deleteById(id);
        return new ResponseEntity<>("Reporte has been deleted!", HttpStatus.OK);
    }
}
