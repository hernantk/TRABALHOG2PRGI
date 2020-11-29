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
