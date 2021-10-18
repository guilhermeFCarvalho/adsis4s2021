package br.unicesumar.adsis4s2021.MeuPedido;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class MeuPedido {

    @Id
    private String id;
    private Date emitidoEm;
    private String numero;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="meu_pedido_id")
    private List<MeuItemPedido> itens;
     
    public MeuPedido() {
    }

    public Date getEmitidoEm() {
        return emitidoEm;
    }
    public String getId() {
        return id;
    }
    public String getNumero() {
        return numero;
    }
    
}
