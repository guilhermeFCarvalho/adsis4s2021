package br.unicesumar.adsis4s2021.guitarra;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guitarras")
public class GuitarraController {

    @Autowired
    private GuitarraRepository repo;

    @GetMapping
    public List<Guitarra> getGuitarra(){
        return repo.findAll();
    }

    @PostMapping
    public String postGuitarra(@RequestBody Guitarra nova){
        if(repo.findById(nova.getId()).isPresent()){
            throw new RuntimeException("Já existe!!");
        }
        nova = repo.save(nova);
        return nova.getId();
    }

    @DeleteMapping("/{id}")
    public void deletePeloId(@PathVariable("id") String id){

        repo.deleteById(id);

    }

    @GetMapping("/marca-")
    public List<Guitarra> getPelaMarca(@RequestParam String marca){
        return repo.recuperarPelaMarca(marca);
    }
    
}
