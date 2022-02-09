package com.company.service.reajuste;

import com.company.ValidacaoException;
import com.company.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste{
    @Override
    public void valida(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);

        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0){
            throw new ValidacaoException("Reajuste não pode ser superior a 40% do salario");
        }
    }
}
