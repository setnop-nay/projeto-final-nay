package br.com.wavebox.repository;

import br.com.wavebox.model.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Integer> {
    // Consultas personalizadas, como encontrar carrinho por cliente
    // List<Carrinho> findByClienteCpf(String cpf);
}
