package br.trabalho.edu.domain.dto.trabalhoProvaAluno;

import br.trabalho.edu.data.entity.Aluno;
import br.trabalho.edu.data.entity.TrabalhoProva;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrabalhoProvaAlunoDto {

    private Integer id;
    private Aluno aluno;
    private TrabalhoProva trabalho;

}
