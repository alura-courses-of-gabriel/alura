package com.company.pedido;

import com.company.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {
    private String nomeDoCliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String nomeDoCliente, LocalDateTime data, Orcamento orcamento) {
        this.nomeDoCliente = nomeDoCliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
}
