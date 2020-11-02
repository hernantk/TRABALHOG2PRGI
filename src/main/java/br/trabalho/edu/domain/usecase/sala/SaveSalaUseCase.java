package br.trabalho.edu.domain.usecase.sala;

import br.trabalho.edu.data.entity.Sala;
import br.trabalho.edu.data.entity.User;
import br.trabalho.edu.data.repository.SalaRespository;
import br.trabalho.edu.domain.dto.sala.NewSalaDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveSalaUseCase {

    private SalaRespository repository;

    public void execute(NewSalaDto dto){

        Sala sala = new Sala();
        sala.setMateria(dto.getMateria());
        sala.setSemestre(dto.getSemestre());

        User user = new User();
        user.setUser_id(dto.getUserid());
        sala.setUser(user);


        repository.save(sala);

    }
}
