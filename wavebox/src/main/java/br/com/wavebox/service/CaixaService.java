package br.com.wavebox.service;

import br.com.wavebox.model.Caixa;
import br.com.wavebox.repository.CaixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaixaService {

    @Autowired
    private CaixaRepository caixaRepository;

    /**
     * Salva uma nova caixa no banco de dados.
     * @param caixa - A caixa a ser salva.
     * @return - A caixa salva.
     */
    public Caixa salvarCaixa(Caixa caixa) {
        return caixaRepository.save(caixa);  // Salva a caixa no banco de dados
    }

    /**
     * Busca uma caixa pelo ID.
     * @param idCaixa - O ID da caixa.
     * @return - A caixa encontrada ou um Optional vazio caso não exista.
     */
    public Optional<Caixa> buscarCaixaPorId(Integer idCaixa) {
        return caixaRepository.findById(idCaixa);
    }

    /**
     * Busca todas as caixas.
     * @return - Lista de todas as caixas.
     */
    public List<Caixa> buscarTodasCaixas() {
        return caixaRepository.findAll();
    }

    /**
     * Deleta uma caixa pelo ID.
     * @param idCaixa - O ID da caixa a ser deletada.
     */
    public void deletarCaixa(Integer idCaixa) {
        caixaRepository.deleteById(idCaixa);  // Deleta a caixa pelo ID
    }
}
