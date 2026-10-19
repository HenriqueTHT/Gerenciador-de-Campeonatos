package com.example.gerenciadordecampeonato.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name= "Pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pessoa;

    private String nome;

    private Long cpf;

    private String email;

    private LocalDate data_nascimento;
}