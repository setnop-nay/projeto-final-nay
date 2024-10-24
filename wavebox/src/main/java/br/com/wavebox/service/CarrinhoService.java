package br.com.wavebox.service;

import br.com.wavebox.model.Carrinho;
import br.com.wavebox.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    /**
     * Adiciona um item ao carrinho.
     * @param carrinho - O item a ser adicionado ao carrinho.
     * @return - O item do carrinho adicionado.
     */
    public Carrinho adicionarItemAoCarrinho(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);  // Adiciona o item no banco de dados
    }

    /**
     * Remove um item do carrinho pelo ID.
     * @param idCarrinho - O ID do item do carrinho a ser removido.
     */
    public void removerItemDoCarrinho(Integer idCarrinho) {
        carrinhoRepository.deleteById(idCarrinho);  // Remove o item pelo ID
    }
}
