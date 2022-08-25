package com.company.desconto;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular (Orcamento orcamento){

        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(new DescontoParaOrcamentoMaiorQueQuinhentos(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
