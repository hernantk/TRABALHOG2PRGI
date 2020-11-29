package br.trabalho.edu.domain.usecase.trabalhoProva;

import br.trabalho.edu.data.entity.TrabalhoProva;
import br.trabalho.edu.data.repository.TrabalhoProvaRepository;
import br.trabalho.edu.domain.dto.trabalhoProva.NewTrabalhoProvaDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveTrabalhoProvaUseCase {

    private TrabalhoProvaRepository repository;

    public void execute(NewTrabalhoProvaDto dto){

        TrabalhoProva trabalho = new TrabalhoProva();

        trabalho.setTitulo(dto.getTitulo());
        trabalho.setDescricao(dto.getDescricao());
        trabalho.setNota(dto.getNota());
        trabalho.setDatapostagem(dto.getDataPostagem());
        trabalho.setDataentrega(dto.getDataEntrega());


        repository.save(trabalho);
    }
}
