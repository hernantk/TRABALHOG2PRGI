package br.trabalho.edu.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @Column(name = "idaluno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idaluno;

    @Column(name = "nome")
    private String nome;

    @Column(name = "datanascimento")
    private LocalDate datanascimento;


    @Column(name = "celular")
    private String celular;

    @Column(name = "email")
    private String email;
}
