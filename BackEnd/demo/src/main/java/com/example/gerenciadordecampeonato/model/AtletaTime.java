package com.example.gerenciadordecampeonato.model;

import jakarta.persistence.*;

@Entity
@Table(name= "atleta_time")
public class AtletaTime {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_atleta")
    private Atleta atleta;

    @ManyToOne
    @JoinColumn(name = "id_time")
    private Time time;

}
