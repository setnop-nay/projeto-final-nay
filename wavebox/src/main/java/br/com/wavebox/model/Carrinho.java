package br.com.wavebox.model;

import jakarta.persistence.*;

@Entity
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarrinho;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;  // Relacionamento com Cliente

    @ManyToOne
    @JoinColumn(name = "idcaixa")
    private Caixa caixa;  // Relacionamento com Caixa

    private String tamanho;  // Tamanho da blusa e do short
    private Integer quantidade;

    // Getters e Setters
    public Integer getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(Integer idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
