package br.trabalho.edu.domain.usecase.materia;

import br.trabalho.edu.data.entity.Materia;
import br.trabalho.edu.data.repository.MateriaRepository;
import br.trabalho.edu.domain.dto.materia.NewMateriaDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveMateriaUseCase {

    private MateriaRepository repository;

    public void execute(NewMateriaDto dto){

        Materia materia = new Materia();

        materia.setMateria(dto.getMateria());

        repository.save(materia);

    }
}
