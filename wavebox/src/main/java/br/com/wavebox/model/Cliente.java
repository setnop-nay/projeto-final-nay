package br.com.wavebox.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    private String cpf;  // Chave primária

    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    @ManyToOne
    @JoinColumn(name = "idplano")
    private PlanoAssinatura planoAssinatura;  // Relacionamento com PlanoAssinatura

    private String statusAssinatura;  // Ex: "Ativo", "Cancelado", "Expirado"

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public PlanoAssinatura getPlanoAssinatura() {
        return planoAssinatura;
    }

    public void setPlanoAssinatura(PlanoAssinatura planoAssinatura) {
        this.planoAssinatura = planoAssinatura;
    }

    public String getStatusAssinatura() {
        return statusAssinatura;
    }

    public void setStatusAssinatura(String statusAssinatura) {
        this.statusAssinatura = statusAssinatura;
    }
}
