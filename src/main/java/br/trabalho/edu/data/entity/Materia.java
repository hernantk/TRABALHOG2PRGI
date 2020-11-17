package br.trabalho.edu.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @Column(name="idmateria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmateria;

    @Column(name="materia")
    private String materia;


}
