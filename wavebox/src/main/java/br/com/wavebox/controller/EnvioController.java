package br.com.wavebox.controller;

import br.com.wavebox.model.Envio;
import br.com.wavebox.service.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/envios")
public class EnvioController {

    @Autowired
    private EnvioService envioService;

    @PostMapping
    public Envio salvarEnvio(@RequestBody Envio envio) {
        return envioService.salvarEnvio(envio);
    }

    @GetMapping("/{idPedido}")
    public Envio buscarEnvioPorPedido(@PathVariable Integer idPedido) {
        return envioService.buscarEnvioPorPedidoId(idPedido);
    }

    @PutMapping("/atualizar/{idEnvio}")
    public Envio atualizarStatusEnvio(@PathVariable Integer idEnvio, @RequestBody Envio envioAtualizado) {
        return envioService.atualizarEnvioStatus(idEnvio, envioAtualizado);
    }
}
