package br.com.wavebox.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedido;

    @ManyToOne
    @JoinColumn(name = "cpf")
    private Cliente cliente;  // Relacionamento com Cliente

    private Date dataPedido;  // Data do pedido
    private Double total;  // Valor total do pedido

    @ManyToOne
    @JoinColumn(name = "idCaixa")
    private Caixa caixa;  // Relacionamento com Caixa (cada pedido está relacionado a uma caixa)

    @OneToOne(mappedBy = "pedido")
    private Envio envio;  // Relacionamento com Envio (um pedido tem um envio)

    // Getters e Setters
    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    // Método para calcular o total do pedido, por exemplo:
    public Double calcularTotal() {
        // Lógica para calcular o total, que pode depender de várias variáveis.
        return total;
    }
}
