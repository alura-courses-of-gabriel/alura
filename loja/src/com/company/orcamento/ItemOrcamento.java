package com.company.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel {
    private BigDecimal valor;

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal valor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
