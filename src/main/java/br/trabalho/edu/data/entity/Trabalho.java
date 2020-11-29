package br.trabalho.edu.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table (name = "trabalho_prova")
public class Trabalho {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "nota")
    private Double nota;

    @Column(name = "datapostagem")
    private Date datapostagem;

    @Column(name = "dataentrega")
    private Date dataentrega;



}
