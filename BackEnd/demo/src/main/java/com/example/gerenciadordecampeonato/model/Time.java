package com.example.gerenciadordecampeonato.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Time")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_time;

    private String nome_time;

    @OneToMany
    @JoinColumn(name = "id_delegado")
    private Pessoa delegado;

}
