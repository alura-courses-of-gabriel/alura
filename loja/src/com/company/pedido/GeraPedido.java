package com.company.pedido;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer quantidadeDeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, Integer quantidadeDeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public void executa(){
        Orcamento orcamento = new Orcamento();
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(this.cliente, data, orcamento);
    }

}
