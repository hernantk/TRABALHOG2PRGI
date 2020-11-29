package br.trabalho.edu.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "aluno")
public class Aluno {

    @Id
    @Column(name = "idaluno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idaluno;

    @Column(name = "nome")
    private String nome;

    @Column(name = "datanascimento")
    private String datanascimento;


    @Column(name = "celular")
    private String celular;

    @Column(name = "email")
    private String email;
}
