package br.trabalho.edu.data.repository;

import br.trabalho.edu.data.entity.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabalhoRepository extends JpaRepository<Trabalho,Integer> {
}
