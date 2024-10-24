package br.com.wavebox.repository;

import br.com.wavebox.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
    // Aqui podemos adicionar consultas personalizadas, se necessário.
    // Por exemplo: Optional<Cliente> findByEmail(String email);
}
