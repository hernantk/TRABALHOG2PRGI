package br.trabalho.edu.domain.usecase.trabalhoProva;

import br.trabalho.edu.data.entity.TrabalhoProva;
import br.trabalho.edu.data.repository.TrabalhoProvaRepository;
import br.trabalho.edu.domain.dto.trabalhoProva.TrabalhoProvaDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class FindAllTrabalhoProvaByAlunoUseCase {

    private TrabalhoProvaRepository repository;

    public List<TrabalhoProvaDto> execute() {
        List<TrabalhoProva> list = repository.findAll();

        return list.stream().map(trabalho -> TrabalhoProvaDto.builder().id(trabalho.getId()).titulo(trabalho.getTitulo())
                .descricao(trabalho.getDescricao())
                .nota(trabalho.getNota())
                .dataPostagem(trabalho.getDatapostagem())
                .dataEntrega(trabalho.getDataentrega())
                .build()).collect(Collectors.toList());

    }
}

