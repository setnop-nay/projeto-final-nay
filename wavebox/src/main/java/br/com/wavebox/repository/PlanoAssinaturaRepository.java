package br.com.wavebox.repository;

import br.com.wavebox.model.PlanoAssinatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoAssinaturaRepository extends JpaRepository<PlanoAssinatura, Integer> {
    // Consultas personalizadas, por exemplo:
    // Optional<PlanoAssinatura> findByNome(String nome);
}
