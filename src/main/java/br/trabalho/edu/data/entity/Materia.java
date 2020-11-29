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
@Table(name = "materia")
public class Materia {

    @Id
    @Column(name="idmateria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmateria;

    @Column(name="materia")
    private String materia;


}
