package br.trabalho.edu.domain.usecase.trabalho;

import br.trabalho.edu.data.entity.Trabalho;
import br.trabalho.edu.data.repository.TrabalhoRepository;
import br.trabalho.edu.domain.dto.trabalho.TrabalhoDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class FindAllTrabalhoUseCase {

    private TrabalhoRepository repository;

    public List<TrabalhoDto> execute(){
        List<Trabalho> list = repository.findAll();

        return list.stream().map(trabalho -> TrabalhoDto.builder().id(trabalho.getId())
        .descricao(trabalho.getDescricao())
        .dataEntrega(trabalho.getDataentrega())
        .dataPostagem(trabalho.getDatapostagem())
        .nota(trabalho.getNota())
        .titulo(trabalho.getTitulo())
        .build()).collect(Collectors.toList());

    }
}
