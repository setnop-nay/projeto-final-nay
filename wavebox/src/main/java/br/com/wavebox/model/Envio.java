package br.com.wavebox.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEnvio;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    private Pedido pedido;  // Relacionamento com Pedido

    private String endereco;  // Endereço de entrega
    private Date dataEnvio;  // Data do envio
    private String metodoEnvio;  // Método de envio (ex: Correios, Transportadora XYZ)
    private String rastreamento;  // Código de rastreamento do envio
    private String statusEnvio;  // Status do envio (ex: "Enviado", "Em trânsito", "Entregue")

    // Getters e Setters
    public Integer getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    public void setMetodoEnvio(String metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public String getRastreamento() {
        return rastreamento;
    }

    public void setRastreamento(String rastreamento) {
        this.rastreamento = rastreamento;
    }

    public String getStatusEnvio() {
        return statusEnvio;
    }

    public void setStatusEnvio(String statusEnvio) {
        this.statusEnvio = statusEnvio;
    }
}
