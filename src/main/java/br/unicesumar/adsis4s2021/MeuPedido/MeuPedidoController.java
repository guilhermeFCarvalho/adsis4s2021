package br.unicesumar.adsis4s2021.MeuPedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/meus-pedidos")
public class MeuPedidoController {
    @Autowired
    private MeuPedidoRepository repo;


    @GetMapping
    public List<MeuPedido> getAll(){

        return repo.findAll();

    }

    @PostMapping
    public String postPedido(@RequestBody MeuPedido novoPedido){

        novoPedido = repo.save(novoPedido);

        return novoPedido.getId();

    }

    
}
