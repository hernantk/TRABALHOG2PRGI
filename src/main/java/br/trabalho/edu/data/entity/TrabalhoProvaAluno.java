package br.trabalho.edu.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "trabalho_aluno")
public class TrabalhoProvaAluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtrabalho_aluno")
    private Integer idtrabalho_aluno;

    @OneToOne
    @JoinColumn(name = "idaluno")
    private Aluno aluno;

    @OneToOne
    @JoinColumn(name = "idtrabalho")
    private TrabalhoProva trabalhoProva;

}
