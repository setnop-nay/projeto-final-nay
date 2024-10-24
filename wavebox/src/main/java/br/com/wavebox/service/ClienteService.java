package br.com.wavebox.service;

import br.com.wavebox.model.Cliente;
import br.com.wavebox.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    /**
     * Salva um novo cliente no banco de dados.
     * @param cliente - O cliente a ser salvo.
     * @return - O cliente salvo.
     */
    public Cliente salvarCliente(Cliente cliente) {
        // Verificando se o cliente já existe com base no CPF
        Optional<Cliente> clienteExistente = clienteRepository.findById(cliente.getCpf());
        if (clienteExistente.isPresent()) {
            throw new RuntimeException("Cliente já cadastrado com este CPF.");
        }

        // Caso o cliente não exista, ele será salvo no banco de dados
        return clienteRepository.save(cliente);
    }

    /**
     * Busca um cliente pelo CPF.
     * @param cpf - O CPF do cliente.
     * @return - O cliente encontrado ou um Optional vazio caso não exista.
     */
    public Optional<Cliente> buscarClientePorCpf(String cpf) {
        return clienteRepository.findById(cpf);  // Busca o cliente no banco de dados
    }

    /**
     * Deleta um cliente pelo CPF.
     * @param cpf - O CPF do cliente a ser deletado.
     */
    public void deletarCliente(String cpf) {
        // Verificando se o cliente existe antes de tentar deletar
        Optional<Cliente> clienteExistente = buscarClientePorCpf(cpf);
        
        if (clienteExistente.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado para deletar.");
        }
        
        clienteRepository.deleteById(cpf);  // Deleta o cliente pelo CPF
    }

    /**
     * Atualiza as informações de um cliente.
     * @param cpf - O CPF do cliente a ser atualizado.
     * @param clienteAtualizado - O cliente com os dados atualizados.
     * @return - O cliente atualizado.
     */
    public Cliente atualizarCliente(String cpf, Cliente clienteAtualizado) {
        // Verificando se o cliente existe antes de tentar atualizar
        Optional<Cliente> clienteExistente = buscarClientePorCpf(cpf);

        if (clienteExistente.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado para atualizar.");
        }

        // Recuperando o cliente existente
        Cliente cliente = clienteExistente.get();

        // Atualizando os dados do cliente
        cliente.setNome(clienteAtualizado.getNome());
        cliente.setEmail(clienteAtualizado.getEmail());
        cliente.setEndereco(clienteAtualizado.getEndereco());
        cliente.setTelefone(clienteAtualizado.getTelefone());

        // Salvando o cliente com as novas informações
        return clienteRepository.save(cliente);
    }
}
