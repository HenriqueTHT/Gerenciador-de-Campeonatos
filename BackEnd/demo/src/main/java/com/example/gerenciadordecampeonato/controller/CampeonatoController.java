package com.example.gerenciadordecampeonato.controller;

import com.example.gerenciadordecampeonato.model.Campeonato;
import com.example.gerenciadordecampeonato.repository.CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/campeonatos")
public class CampeonatoController {

    @Autowired
    private CampeonatoRepository repository;

    @GetMapping
    public List<Campeonato> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Campeonato criar(@RequestBody Campeonato campeonato) {
        return repository.save(campeonato);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Campeonato> buscar(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
