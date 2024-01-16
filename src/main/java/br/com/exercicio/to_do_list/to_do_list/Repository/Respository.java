package br.com.exercicio.to_do_list.to_do_list.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.exercicio.to_do_list.to_do_list.Model.Lista;

@Repository
public interface Respository extends CrudRepository<Lista, Integer> {
    List<Lista> findAll();
}
