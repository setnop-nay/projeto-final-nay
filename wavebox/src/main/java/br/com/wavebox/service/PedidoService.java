package br.com.wavebox.service;

import br.com.wavebox.model.Pedido;
import br.com.wavebox.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    /**
     * Salva um novo pedido no banco de dados.
     * @param pedido - O pedido a ser salvo.
     * @return - O pedido salvo.
     */
    public Pedido salvarPedido(Pedido pedido) {
        // Aqui podemos calcular o total do pedido ou outras lógicas se necessário
        return pedidoRepository.save(pedido);
    }

    /**
     * Busca um pedido pelo ID.
     * @param idPedido - O ID do pedido.
     * @return - O pedido encontrado ou um Optional vazio caso não exista.
     */
    public Optional<Pedido> buscarPedidoPorId(Integer idPedido) {
        return pedidoRepository.findById(idPedido);
    }

    /**
     * Busca todos os pedidos feitos por um cliente, dado o CPF.
     * @param cpf - O CPF do cliente.
     * @return - A lista de pedidos feitos pelo cliente.
     */
    public List<Pedido> buscarPedidosPorClienteCpf(String cpf) {
        return pedidoRepository.findByClienteCpf(cpf);
    }

    /**
     * Deleta um pedido pelo ID.
     * @param idPedido - O ID do pedido a ser deletado.
     */
    public void deletarPedido(Integer idPedido) {
        pedidoRepository.deleteById(idPedido);
    }
}
