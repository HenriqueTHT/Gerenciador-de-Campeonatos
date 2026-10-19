package com.example.gerenciadordecampeonato.model;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "CampeonatoTime")
public class CampeonatoTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_campeonato")
    private Campeonato campeonato;

    @ManyToOne
    @JoinColumn(name = "id_time")
    private Time time;


    private LocalDate data_inscricao;
}
