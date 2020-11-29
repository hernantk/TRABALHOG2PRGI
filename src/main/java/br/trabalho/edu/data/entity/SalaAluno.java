package br.trabalho.edu.data.entity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sala_aluno")
public class SalaAluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsalaaluno")
    private Integer idsalaaluno;

    @OneToOne
    @JoinColumn(name = "idaluno")
    private Aluno aluno;

    @OneToOne
    @JoinColumn(name = "idsala")
    private Sala sala;

}
