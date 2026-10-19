package com.example.gerenciadordecampeonato.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name= "Jogo")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_jogo;

    @ManyToOne
    @JoinColumn(name = "id_campeonato")
    private Campeonato campeonato;

    @ManyToOne
    @JoinColumn(name = "id_time_mandante")
    private Time timeMandante;


    @ManyToOne
    @JoinColumn(name = "id_time_visitante")
    private Time timeVisitante;

    private LocalDateTime data_hora;

    private Integer placar_mandante;

    private Integer placar_visitante;

    private String fase_rodada;
}
