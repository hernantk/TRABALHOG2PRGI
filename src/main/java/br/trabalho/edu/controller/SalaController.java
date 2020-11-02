package br.trabalho.edu.controller;

import br.trabalho.edu.domain.dto.sala.NewSalaDto;
import br.trabalho.edu.domain.dto.sala.SalaDto;
import br.trabalho.edu.domain.usecase.sala.FindByUserSalaUseCase;
import br.trabalho.edu.domain.usecase.sala.SaveSalaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/sala")
public class SalaController {


    private FindByUserSalaUseCase findAllUseCase;
    private SaveSalaUseCase saveUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<List<SalaDto>> list(@PathVariable Integer id){
        List<SalaDto> list = findAllUseCase.execute(id);

        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);

    }
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody NewSalaDto dto){
        saveUseCase.execute(dto);
        return ResponseEntity.ok().build();

    }

}
