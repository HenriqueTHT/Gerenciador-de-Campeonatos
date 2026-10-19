package com.example.gerenciadordecampeonato.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "Campeonato")
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_campeonato;

    private String nome_campeonato;

    private String descricao;

    private String modalidade;

    private LocalDate data_inicio;

    private LocalDate data_fim;
}
