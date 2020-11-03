package br.trabalho.edu.domain.usecase.aluno;

import br.trabalho.edu.data.entity.Aluno;
import br.trabalho.edu.data.repository.AlunoRepository;
import br.trabalho.edu.domain.dto.aluno.NewAlunoDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveAlunoUseCase {

    private AlunoRepository repository;

    public void execute(NewAlunoDto newAluno) {
        Aluno aluno = new Aluno();

        aluno.setNome(newAluno.getNome());
        aluno.setDatanascimento(newAluno.getDatanascimento());
        aluno.setCelular(newAluno.getCelular());
        aluno.setEmail(newAluno.getEmail());

        repository.save(aluno);
    }

}
