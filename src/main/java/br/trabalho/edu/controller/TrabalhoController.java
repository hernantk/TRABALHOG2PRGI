package br.trabalho.edu.controller;


import br.trabalho.edu.domain.dto.trabalho.NewTrabalhoDto;
import br.trabalho.edu.domain.dto.trabalho.TrabalhoDto;

import br.trabalho.edu.domain.usecase.trabalho.FindAllTrabalhoUseCase;
import br.trabalho.edu.domain.usecase.trabalho.SaveTrabalhoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {


    private FindAllTrabalhoUseCase findAllUseCase;
    private SaveTrabalhoUseCase saveUseCase;

    @GetMapping
    public ResponseEntity<List<TrabalhoDto>> list(){
        List<TrabalhoDto> list = findAllUseCase.execute();

        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);

    }
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody NewTrabalhoDto dto){
        saveUseCase.execute(dto);
        return ResponseEntity.ok().build();

    }

}
