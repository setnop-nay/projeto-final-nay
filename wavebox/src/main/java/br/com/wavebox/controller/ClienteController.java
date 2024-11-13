package br.com.wavebox.controller;

import br.com.wavebox.model.Cliente;
import br.com.wavebox.model.User;
import br.com.wavebox.repository.UserRepository;
import br.com.wavebox.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    
    @Autowired
    private UserRepository user;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
        return clienteService.salvarCliente(cliente);
    }

    @GetMapping("/{cpf}")
    public Cliente buscarClientePorCpf(@PathVariable String cpf) {
        return clienteService.buscarClientePorCpf(cpf)
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado."));
    }



    @DeleteMapping("/{cpf}")
    public void deletarCliente(@PathVariable String cpf) {
        clienteService.deletarCliente(cpf);
    }

    @PutMapping("/{cpf}")
    public Cliente atualizarCliente(@PathVariable String cpf, @RequestBody Cliente clienteAtualizado) {
        return clienteService.atualizarCliente(cpf, clienteAtualizado);
    }
}
