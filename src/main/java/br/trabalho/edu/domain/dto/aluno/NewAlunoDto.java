package br.trabalho.edu.domain.dto.aluno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewAlunoDto {

    private String nome;
    private String datanascimento;
    private String celular;
    private String email;

}
