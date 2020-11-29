package br.trabalho.edu.controller;

import br.trabalho.edu.domain.dto.aluno.AlunoDto;
import br.trabalho.edu.domain.dto.aluno.NewAlunoDto;
import br.trabalho.edu.domain.usecase.aluno.FindAllAlunosByMateria;
import br.trabalho.edu.domain.usecase.aluno.FindAllAlunosUseCase;
import br.trabalho.edu.domain.usecase.aluno.SaveAlunoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunoController {


    private FindAllAlunosUseCase findAllUseCase;
    private FindAllAlunosByMateria findByMateria;
    private SaveAlunoUseCase saveUseCase;


    @GetMapping
    public ResponseEntity<List<AlunoDto>> findAll(){
        List<AlunoDto> list = findAllUseCase.execute();

        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);

    }

    @GetMapping("/byMateria/{materia}")
    public ResponseEntity<List<AlunoDto>> findByMateria (@PathVariable Integer materia) {
        List<AlunoDto> alunos = findByMateria.execute(materia);

        if (alunos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(alunos);
    }


    @PostMapping
    public ResponseEntity<Object> save(@RequestBody NewAlunoDto newAluno){
        saveUseCase.execute(newAluno);
        return ResponseEntity.ok().build();

    }

}
