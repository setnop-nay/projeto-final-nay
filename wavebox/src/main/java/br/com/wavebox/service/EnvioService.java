package br.com.wavebox.service;

import br.com.wavebox.model.Envio;
import br.com.wavebox.repository.EnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvioService {

    @Autowired
    private EnvioRepository envioRepository;

    /**
     * Salva um novo envio no banco de dados.
     * @param envio - O envio a ser salvo.
     * @return - O envio salvo.
     */
    public Envio salvarEnvio(Envio envio) {
        return envioRepository.save(envio);
    }

    /**
     * Busca um envio pelo ID do pedido.
     * @param idPedido - O ID do pedido.
     * @return - O envio encontrado ou null se não encontrado.
     */
    public Envio buscarEnvioPorPedidoId(Integer idPedido) {
        return envioRepository.findById(idPedido).orElse(null);  // Buscar o envio relacionado ao pedido
    }

    /**
     * Atualiza o status do envio.
     * @param idEnvio - O ID do envio.
     * @param envioAtualizado - O envio com o novo status.
     * @return - O envio atualizado.
     */
    public Envio atualizarEnvioStatus(Integer idEnvio, Envio envioAtualizado) {
        Envio envio = envioRepository.findById(idEnvio).orElseThrow(() -> new RuntimeException("Envio não encontrado."));
        envio.setStatusEnvio(envioAtualizado.getStatusEnvio());
        envio.setRastreamento(envioAtualizado.getRastreamento());
        return envioRepository.save(envio);
    }
}
