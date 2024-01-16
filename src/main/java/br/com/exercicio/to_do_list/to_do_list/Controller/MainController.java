package br.com.exercicio.to_do_list.to_do_list.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.exercicio.to_do_list.to_do_list.Model.Lista;
import br.com.exercicio.to_do_list.to_do_list.Repository.Respository;


@RestController
@RequestMapping("/tarefas")
public class MainController {

    @Autowired
    private Respository repositorio;

    
    // CREATE
    @PostMapping("")
    public Lista createTarefa(@RequestBody Lista task)
    {
        Lista savedTask = repositorio.save(task);
        
        return savedTask;
    }
    
    // READ
    @GetMapping("")
    public List<Lista> getTarefa()
    {
        return repositorio.findAll();
    }

    // UPDATE
    @PutMapping("/{id}")
    public Lista updateTarefa(@PathVariable Integer id, @RequestBody Lista tarefa)
    {

        Lista tarefaUpdate = repositorio.findById(id).orElse(null);

        if (tarefaUpdate != null)
        {

            tarefaUpdate.setDescricao(tarefa.getDescricao());
            tarefaUpdate.setSituacao(tarefa.isSituacao());

            return repositorio.save(tarefaUpdate);
        }

        return null;
    }

    // DELETE in ID
    @DeleteMapping("/{id}")
    public Lista deletarTarefaid(@RequestParam Integer id)
    {

        if (id != null)
        {
            repositorio.deleteById(id);

            return repositorio.findById(id).orElse(null);
        }

        return null;
    }

}
