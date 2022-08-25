package com.company.orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orcamento não pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orcamento não pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Orcamento não pode ser finalizado!");
    }

}
