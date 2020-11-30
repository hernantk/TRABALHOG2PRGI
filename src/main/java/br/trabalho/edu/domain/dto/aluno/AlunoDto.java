package br.trabalho.edu.domain.dto.aluno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlunoDto {

    private Integer id;
    private String nome;
    private String email;


}
