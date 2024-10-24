package br.com.wavebox.repository;

import br.com.wavebox.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // Método para buscar o usuário pelo nome de usuário
	User getOneByCpf(String cpf);

}
