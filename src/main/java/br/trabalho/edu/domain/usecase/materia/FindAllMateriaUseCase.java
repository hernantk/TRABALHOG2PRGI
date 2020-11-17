package br.trabalho.edu.domain.usecase.materia;

import br.trabalho.edu.data.entity.Materia;
import br.trabalho.edu.data.repository.MateriaRepository;
import br.trabalho.edu.domain.dto.materia.MateriaDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FindAllMateriaUseCase {

    private MateriaRepository repository;

    public List<MateriaDto> execute() {
        List<Materia> materias = repository.findAll();

        return materias.stream().map(c ->
                new MateriaDto(c.getIdmateria(), c.getMateria())).collect(Collectors.toList());

    }
}
