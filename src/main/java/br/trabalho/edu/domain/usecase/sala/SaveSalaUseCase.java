package br.trabalho.edu.domain.usecase.sala;

import br.trabalho.edu.data.entity.Sala;
import br.trabalho.edu.data.repository.SalaRepository;
import br.trabalho.edu.domain.dto.sala.NewSalaDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveSalaUseCase {

    private SalaRepository repository;

    public void execute(NewSalaDto dto){

        Sala sala = new Sala();
        sala.setMateria(dto.getMateria());
        sala.setSemestre(dto.getSemestre());




        repository.save(sala);

    }
}
