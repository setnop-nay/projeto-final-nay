package br.com.wavebox.repository;

import br.com.wavebox.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    
    // Método para buscar pedidos pelo CPF do cliente
    List<Pedido> findByClienteCpf(String cpf);
}
