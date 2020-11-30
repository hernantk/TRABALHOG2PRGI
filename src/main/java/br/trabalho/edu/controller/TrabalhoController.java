package br.trabalho.edu.controller;


import br.trabalho.edu.domain.dto.trabalhoProva.NewTrabalhoProvaDto;
import br.trabalho.edu.domain.dto.trabalhoProva.TrabalhoProvaDto;

import br.trabalho.edu.domain.usecase.trabalhoProva.FindAllTrabalhoProvaByAlunoUseCase;
import br.trabalho.edu.domain.usecase.trabalhoProva.SaveTrabalhoProvaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {


    private FindAllTrabalhoProvaByAlunoUseCase findAllUseCase;
    private SaveTrabalhoProvaUseCase saveUseCase;

    @GetMapping
    public ResponseEntity<List<TrabalhoProvaDto>> list(){
        List<TrabalhoProvaDto> list = findAllUseCase.execute();

        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);

    }
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody NewTrabalhoProvaDto dto){
        saveUseCase.execute(dto);
        return ResponseEntity.ok().build();

    }

}
