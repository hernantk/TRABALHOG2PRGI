package br.trabalho.edu.domain.usecase.sala;

import br.trabalho.edu.data.entity.Sala;
import br.trabalho.edu.data.repository.SalaRepository;
import br.trabalho.edu.domain.dto.sala.SalaDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class FindByUserSalaUseCase {

    private SalaRepository repository;

    public List<SalaDto> execute(){
        List<Sala> result= repository.findAll();

        return result.stream().map(
                r -> SalaDto.builder().id(r.getIdsala())
                .materia(r.getMateria())
                .semestre(r.getSemestre()).build()).collect(Collectors.toList());
    }
}
