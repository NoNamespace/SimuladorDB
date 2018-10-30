package com.example.SimuladorDB.controller;

import com.example.SimuladorDB.model.Resultado;
import com.example.SimuladorDB.repository.ResultadoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ResultadoController {

    ResultadoRepository resultadoRepository;

    @GetMapping("/resultados")
    public List<Resultado> getAllResultado(){
        List<Resultado> resultados = new ArrayList<>();
        resultadoRepository.findAll().forEach(resultados::add);
        return resultados;
    }

    @PostMapping(value = "/resultados/create")
    public Resultado postResultado(@RequestBody Resultado resultado){
        Resultado _resultado = resultadoRepository.save(resultado);
        return _resultado;
    }

    @DeleteMapping("/resultados/{id}")
    public ResponseEntity<String> deleteResultado(@PathVariable("id") long id){
        resultadoRepository.deleteById(id);
        return new ResponseEntity<>("Resultado has been deleted!", HttpStatus.OK);
    }
}
