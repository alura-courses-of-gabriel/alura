package com.company.desconto;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaiorQueQuinhentos extends Desconto {
    public DescontoParaOrcamentoMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
