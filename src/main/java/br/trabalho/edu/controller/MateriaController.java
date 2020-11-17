package br.trabalho.edu.controller;

import br.trabalho.edu.domain.dto.materia.MateriaDto;
import br.trabalho.edu.domain.dto.materia.NewMateriaDto;
import br.trabalho.edu.domain.usecase.materia.FindAllMateriaUseCase;
import br.trabalho.edu.domain.usecase.materia.SaveMateriaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/materia")
public class MateriaController {

    private FindAllMateriaUseCase findAllUseCase;
    private SaveMateriaUseCase saveUseCase;


    @GetMapping
    public ResponseEntity<List<MateriaDto>> findAll(){
        List<MateriaDto> list = findAllUseCase.execute();

        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);

    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody NewMateriaDto newMateria){
        saveUseCase.execute(newMateria);
        return ResponseEntity.ok().build();

    }
}
