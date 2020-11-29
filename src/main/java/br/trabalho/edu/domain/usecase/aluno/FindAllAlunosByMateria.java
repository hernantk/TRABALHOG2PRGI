package br.trabalho.edu.domain.usecase.aluno;

import br.trabalho.edu.data.entity.Aluno;
import br.trabalho.edu.data.repository.AlunoRepository;
import br.trabalho.edu.domain.dto.aluno.AlunoDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FindAllAlunosByMateria {

    private AlunoRepository repository;

    public List<AlunoDto> execute(Integer materia) {

        List<Aluno> alunos = repository.findByMateria(materia);


        return alunos.stream().map(
                c -> new AlunoDto(c.getIdaluno(), c.getNome(), c.getDatanascimento(), c.getCelular(), c.getEmail(), c.getIdmateria().getMateria())
        ).collect(Collectors.toList());
    }

}
