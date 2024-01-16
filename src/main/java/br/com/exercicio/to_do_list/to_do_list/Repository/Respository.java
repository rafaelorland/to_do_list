package br.com.exercicio.to_do_list.to_do_list.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.exercicio.to_do_list.to_do_list.Model.Lista;

public interface Respository extends CrudRepository<Lista, Integer> {
    
}
