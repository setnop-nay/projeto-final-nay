package br.com.wavebox.controller;

import br.com.wavebox.model.Carrinho;
import br.com.wavebox.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @PostMapping("/adicionar")
    public Carrinho adicionarAoCarrinho(@RequestBody Carrinho carrinho) {
        return carrinhoService.adicionarItemAoCarrinho(carrinho);
    }

    @DeleteMapping("/remover/{idCarrinho}")
    public void removerDoCarrinho(@PathVariable Integer idCarrinho) {
        carrinhoService.removerItemDoCarrinho(idCarrinho);
    }
}
