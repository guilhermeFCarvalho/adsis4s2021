package br.unicesumar.adsis4s2021.meu.meuProduto_Transiente;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.produto_transiente.ProdutoTransiente;

@RestController
@RequestMapping("/mprodutos-transientes")
public class meuProdutoTransienteController {

    private List<meuProdutoTransiente> produtos = new ArrayList<>();

    public meuProdutoTransienteController(){
        produtos.add(new meuProdutoTransiente("1", "sabão", 25.00));
        produtos.add(new meuProdutoTransiente("2", "cenoura", 5.00));
    }

    @GetMapping
    public List<meuProdutoTransiente> getProdutos(){
        return this.produtos;
    } 

    @PostMapping
    public void postProduto(@RequestBody meuProdutoTransiente nProduto){
        produtos.add(nProduto);
    }
    
    @GetMapping("/{id}")
    public meuProdutoTransiente getProdutoId(@PathVariable("id") String id){
        for (meuProdutoTransiente p : produtos) {

            if(p.getId().equals(id)){
                return p;
            }
            
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public void deleteProdutoId(@PathVariable("id") String id){
        meuProdutoTransiente remover = null;
        for (meuProdutoTransiente p : produtos) {
            if(p.getId().equals(id)){
                remover = p;
            }
            
        }
        if(remover != null){
            produtos.remove(remover);
        }
    }
}
