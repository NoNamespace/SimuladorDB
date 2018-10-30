package com.example.SimuladorDB.controller;

import com.example.SimuladorDB.model.StockInicial;
import com.example.SimuladorDB.repository.StockInicialRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class StockInicialController {

    StockInicialRepository stockInicialRepository;

    @GetMapping("/stockInicials")
    public List<StockInicial> getAllStockInicial(){
        List<StockInicial> stockInicials = new ArrayList<>();
        stockInicialRepository.findAll().forEach(stockInicials::add);
        return stockInicials;
    }

    @PostMapping(value = "/stockInicials/create")
    public StockInicial postStockInicial(@RequestBody StockInicial stockInicial){
        StockInicial _stockInicial = stockInicialRepository.save(stockInicial);
        return _stockInicial;
    }

    @DeleteMapping("/stockInicials/{id}")
    public ResponseEntity<String> deleteStockInicial(@PathVariable("id") long id){
        stockInicialRepository.deleteById(id);
        return new ResponseEntity<>("StockInicial has been deleted!", HttpStatus.OK);
    }
}
