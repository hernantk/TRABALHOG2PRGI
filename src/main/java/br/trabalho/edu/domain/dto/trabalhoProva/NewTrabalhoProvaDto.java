package br.trabalho.edu.domain.dto.trabalhoProva;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewTrabalhoProvaDto {

    private String titulo;
    private String descricao;
    private Double nota;
    private Date dataPostagem;
    private Date dataEntrega;

}
