package br.trabalho.edu.domain.dto.aluno;

import br.trabalho.edu.data.entity.Materia;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewAlunoDto {

    private String nome;
    private Date datanascimento;
    private String celular;
    private String email;
    private Materia materia;

}
