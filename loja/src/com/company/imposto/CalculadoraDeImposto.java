package com.company.imposto;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {
    public BigDecimal calcular(Orcamento orcamento, ImpostoCalculavel imposto){
        return imposto.calcular(orcamento);
    }
}
