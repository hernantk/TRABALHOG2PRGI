package br.trabalho.edu.domain.dto.materia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MateriaDto {

    private Integer id;
    private String materia;


}
