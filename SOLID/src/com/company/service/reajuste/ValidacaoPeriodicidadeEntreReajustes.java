package com.company.service.reajuste;

import com.company.ValidacaoException;
import com.company.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {
    @Override
    public void valida(Funcionario funcionario, BigDecimal aumento) {
        LocalDate ultimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate hoje = LocalDate.now();

        Long diferenca = ChronoUnit.MONTHS.between(hoje, ultimoReajuste);

        if (diferenca < 6) {
            throw new ValidacaoException("O intervalo entre os reajustes deve ser de pelo menos 6 meses");
        }
    }
}
