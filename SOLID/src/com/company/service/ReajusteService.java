package com.company.service;

import com.company.model.Funcionario;
import com.company.service.reajuste.ValidacaoReajuste;

import java.math.BigDecimal;
import java.util.Collection;

public class ReajusteService {
    private final Collection<ValidacaoReajuste> validacoes;

    public ReajusteService(Collection<ValidacaoReajuste> validacaoReajustes) {
        this.validacoes = validacaoReajustes;
    }

    public void ajustarSalario(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(validacao -> validacao.valida(funcionario, aumento));

        BigDecimal novoSalario = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(novoSalario);
    }
}
