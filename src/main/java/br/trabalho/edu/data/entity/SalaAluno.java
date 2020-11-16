package br.trabalho.edu.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sala_aluno")
@IdClass(SalaAlunoId.class)
public class SalaAluno {

    @Id
    @OneToMany
    @JoinColumn(name = "idsala")
    private Sala sala;

    @Id
    @ManyToOne
    @JoinColumn(name = "idaluno")
    private Aluno aluno;
}
