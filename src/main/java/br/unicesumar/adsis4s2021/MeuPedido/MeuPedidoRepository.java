package br.unicesumar.adsis4s2021.MeuPedido;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unicesumar.adsis4s2021.pedido.Pedido;

public interface MeuPedidoRepository extends JpaRepository<MeuPedido, String> {
    
}
