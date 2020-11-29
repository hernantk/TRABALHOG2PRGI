package br.trabalho.edu.domain.usecase.trabalho;

import br.trabalho.edu.data.entity.Trabalho;
import br.trabalho.edu.data.repository.TrabalhoRepository;
import br.trabalho.edu.domain.dto.trabalho.NewTrabalhoDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaveTrabalhoUseCase {

    private TrabalhoRepository repository;

    public void execute(NewTrabalhoDto dto){

        Trabalho trabalho = new Trabalho();

        trabalho.setDataentrega(dto.getDataEntrega());
        trabalho.setDatapostagem(dto.getDataPostagem());
        trabalho.setDescricao(dto.getDescricao());
        trabalho.setNota(dto.getNota());
        trabalho.setTitulo(dto.getTitulo());





        repository.save(trabalho);
    }
}
