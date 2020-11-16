package br.trabalho.edu.data.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SalaAlunoId implements Serializable {


    private Sala sala;

    private Aluno aluno;
}
