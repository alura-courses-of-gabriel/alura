package com.company.imposto;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends ImpostoCalculavel {
    public ICMS(ImpostoCalculavel outroImposto) {
        super(outroImposto);
    }

    @Override
    protected BigDecimal calculoEspecifico(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
