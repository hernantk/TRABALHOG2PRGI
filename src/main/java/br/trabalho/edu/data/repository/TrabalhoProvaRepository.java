package br.trabalho.edu.data.repository;

import br.trabalho.edu.data.entity.Aluno;
import br.trabalho.edu.data.entity.TrabalhoProva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrabalhoProvaRepository extends JpaRepository<TrabalhoProva,Integer> {

}
