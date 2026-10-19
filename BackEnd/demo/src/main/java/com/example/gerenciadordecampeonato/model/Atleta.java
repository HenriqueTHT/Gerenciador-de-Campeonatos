package com.example.gerenciadordecampeonato.model;
import jakarta.persistence.*;

@Entity
@Table(name= "Atleta")
public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_atleta;

    @OneToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;


}
