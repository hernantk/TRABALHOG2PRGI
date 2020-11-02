package br.trabalho.edu.domain.dto.sala;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SalaDto {

    private Integer id;
    private String materia;
    private String semestre;
}
