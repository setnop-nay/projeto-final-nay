package br.com.wavebox.repository;

import br.com.wavebox.model.Caixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaixaRepository extends JpaRepository<Caixa, Integer> {
    // Consultas personalizadas para a caixa
}
