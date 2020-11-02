package br.trabalho.edu.data.repository;

import br.trabalho.edu.data.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaRespository extends JpaRepository<Sala,Integer>{

    List<Sala> findAllByUser(Integer id);


}
