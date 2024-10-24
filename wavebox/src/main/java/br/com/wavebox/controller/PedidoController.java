package br.com.wavebox.controller;

import br.com.wavebox.model.Pedido;
import br.com.wavebox.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido salvarPedido(@RequestBody Pedido pedido) {
        return pedidoService.salvarPedido(pedido);
    }

    @GetMapping("/{idPedido}")
    public Pedido buscarPedidoPorId(@PathVariable Integer idPedido) {
        return pedidoService.buscarPedidoPorId(idPedido).orElseThrow(() -> new RuntimeException("Pedido não encontrado."));
    }

    @GetMapping("/cliente/{cpf}")
    public List<Pedido> buscarPedidosPorCliente(@PathVariable String cpf) {
        return pedidoService.buscarPedidosPorClienteCpf(cpf);
    }

    @DeleteMapping("/{idPedido}")
    public void deletarPedido(@PathVariable Integer idPedido) {
        pedidoService.deletarPedido(idPedido);
    }
}
