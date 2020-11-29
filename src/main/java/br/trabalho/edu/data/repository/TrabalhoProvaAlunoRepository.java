package br.trabalho.edu.data.repository;

import br.trabalho.edu.data.entity.Aluno;
import br.trabalho.edu.data.entity.TrabalhoProva;
import br.trabalho.edu.data.entity.TrabalhoProvaAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrabalhoProvaAlunoRepository extends JpaRepository<TrabalhoProvaAluno,Integer> {



}
