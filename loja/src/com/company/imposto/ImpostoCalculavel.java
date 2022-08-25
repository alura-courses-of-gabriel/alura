package com.company.imposto;

import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class ImpostoCalculavel {

    private ImpostoCalculavel outroImposto;

    public ImpostoCalculavel(ImpostoCalculavel outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected abstract BigDecimal calculoEspecifico(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorEsteImposto = calculoEspecifico(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (outroImposto != null){
            valorOutroImposto = outroImposto.calcular(orcamento);
        }

        return valorEsteImposto.add(valorOutroImposto);

    }
}
