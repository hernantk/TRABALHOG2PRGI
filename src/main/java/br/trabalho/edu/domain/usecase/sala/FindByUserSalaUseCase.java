package br.trabalho.edu.domain.usecase.sala;

import br.trabalho.edu.data.entity.Sala;
import br.trabalho.edu.data.repository.SalaRespository;
import br.trabalho.edu.domain.dto.sala.SalaDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class FindByUserSalaUseCase {

    private SalaRespository repository;

    public List<SalaDto> execute(Integer id){
        List<Sala> result= repository.findAllByUser(id);

        return result.stream().map(
                r -> SalaDto.builder().id(r.getIdsala())
                .materia(r.getMateria())
                .semestre(r.getSemestre()).build()).collect(Collectors.toList());
    }
}
