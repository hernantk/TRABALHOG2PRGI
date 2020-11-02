package br.trabalho.edu.domain.dto.sala;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class NewSalaDto {

    private String materia;
    private String semestre;
    private Integer userid;
}
