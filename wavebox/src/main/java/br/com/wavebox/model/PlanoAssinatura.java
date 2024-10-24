package br.com.wavebox.model;

import jakarta.persistence.*;

@Entity
public class PlanoAssinatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlano;

    private String nome;  // Ex: Mensal, Trimestral, Semestral, Anual
    private Double preco;
    private Integer duracaoMeses;  // Duração em meses (1 para Mensal, 3 para Trimestral, 6 para Semestral, 12 para Anual)

    // Getters e Setters
    public Integer getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(Integer duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }
}
