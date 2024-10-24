package br.com.wavebox.model;

import jakarta.persistence.*;

@Entity
public class CaixaProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idcaixa")
    private Caixa caixa;  // Relacionamento com Caixa

    @ManyToOne
    @JoinColumn(name = "idproduto")
    private Produto produto;  // Relacionamento com Produto (caixa que contém blusa e short)

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
