package com.example.gerenciadordecampeonato.controller;

import com.example.gerenciadordecampeonato.entity.Campeonato;
import com.example.gerenciadordecampeonato.entity.Time;
import com.example.gerenciadordecampeonato.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/times")
public class TimeController {

    @Autowired
    private TimeRepository repository;

    @GetMapping
    public List<Time> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Time criar(@RequestBody Time time) {
        return repository.save(time);
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Time> atualizar(@PathVariable Long id, @RequestBody Time dadosAtualizados){
        return repository.findById(id).map(time ->{
            time.setNome_time(dadosAtualizados.getNome_time());
            time.setDelegado(dadosAtualizados.getDelegado());
            Time atualizado = repository.save(time);
            return ResponseEntity.ok(atualizado);

        }).orElse(ResponseEntity.notFound().build());
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
