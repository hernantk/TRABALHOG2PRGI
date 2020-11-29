package br.trabalho.edu.data.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @Column(name = "idsala")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsala;

    @Column(name = "semestre")
    private String semestre;

    @Column(name = "materia")
    private String materia;



}
